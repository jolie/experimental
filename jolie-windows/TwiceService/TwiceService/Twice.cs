using Jolie.net;
using Jolie.net.ports;
using Jolie.runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TwiceService
{
    public class Twice
    {
        private InputPort inputPort;
        public InputPort InputPort
        {
            get { return inputPort; }
            set { inputPort = value; }
        }

        private int port;
        public int Port
        {
            get { return port; }
            set { port = value; }
        }

        public Twice(int port)
        {
            this.Port = port;
            InputPort = new InputPort(Port);
        }

        public void CalcTwice()
        {
            while (true)
            {
                if (InputPort.Listener.Pending())
                {
                    InputPort.Listen();
                    try
                    {
                        CommMessage m = InputPort.ReceiveMessage();
                        InputPort.SendMessage(new CommMessage(m.Id, m.OperationName, m.ResourcePath, new Value(twice(m.Value.IntValue)), m.IsFault ? m.Fault : null));
                    }
                    catch (Exception e) { Console.WriteLine(e.Message); }
                }
            }
        }

        public int twice(int num)
        {
            return num * 2;
        }
    }
}
