using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.ServiceProcess;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace TwiceService
{
    public partial class Service1 : ServiceBase
    {
        public static int port;
        public static void run()
        {
            Twice t = new Twice(port);
            t.CalcTwice();
        }

        public Service1()
        {
            InitializeComponent();
        }

        protected override void OnStart(string[] args)
        {
            if (args.Length == 0)
            {
                Console.WriteLine("No port specified");
                Environment.Exit(0);
            }
            else
            {
                try
                {
                    port = Int32.Parse(args[0]);
                    Thread th = new Thread(new ThreadStart(run));
                    th.Start();
                }
                catch (FormatException) { Console.WriteLine("TwiceService >> Invalid port: " + args[0]); Console.ReadKey(); }
            }
            //string openString = DateTime.Now.ToString() + " | Service Started";
            //string path = @"C:\log.txt";

            //List<string> processes = new List<string>();
            //foreach (Process process in Process.GetProcesses())
            //{
            //    processes.Add(process.ProcessName);
            //}

            //if (File.Exists(path))
            //{
            //    using (StreamWriter writer = File.AppendText(path))
            //    {
            //        writer.WriteLine(openString);
            //        foreach (string item in processes)
            //            writer.WriteLine(item);
            //        writer.Close();
            //    }
            //}
            //else
            //{
            //    File.WriteAllText(path, openString);
            //    using (StreamWriter writer = File.AppendText(path))
            //    {
            //        foreach (string item in processes)
            //            writer.WriteLine(item);
            //        writer.Close();
            //    }
            //}
        }

        protected override void OnStop()
        {
            string stopString = DateTime.Now.ToString() + " | Service Stopped";
            using (StreamWriter writer = File.AppendText(@"C:\log.txt"))
            {
                writer.WriteLine(stopString);
                writer.Close();
            }
        }
    }
}
