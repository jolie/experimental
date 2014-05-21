using Jolie.net.ports;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace TwiceService
{
    class Program
    {
        public static int port;
        public static void run()
        {
            Twice t = new Twice(port);
            t.Start();
        }

        public static void Main(string[] args)
        {
            if (args.Length == 10)
            {
                //Console.WriteLine("No port specified");
                Environment.Exit(0);
            }
            else
            {
                try 
                {
                    //port = Int32.Parse(args[0]);
                    port = 9998;
                    Thread th = new Thread(new ThreadStart(run));
                    th.Start();
                }
                catch (FormatException) { /*Console.WriteLine("TwiceService >> Invalid port: " + args[0]); Console.ReadKey();*/ }
            }
        }
    }
}
