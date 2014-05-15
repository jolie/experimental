using DBSimulator;
using DBSimulator.Data;
using Jolie.net;
using Jolie.net.ports;
using Jolie.runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading;
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
                        if (m != null && m.Value != null)
                        {
                            switch (m.OperationName.ToLower())
                            { 
                                case "twice":
                                    handleTwice(m);
                                    break;
                                case "test":
                                    handleTest(m);
                                    break;
                                case "insert":
                                    handleInsert(m);
                                    break;
                                case "shutdown":
                                    handleShutDown();
                                    break;
                            }
                        }
                        InputPort.Close();
                    }
                    catch (Exception) {  }
                }
            }
        }

        private void handleGet(CommMessage m)
        {
            PersonDB db = new PersonDB();
            Person person = new Person(m.Value);
            PersonResponse resp = new PersonResponse(db.Get(person));
            InputPort.SendMessage(new CommMessage(m.Id, m.OperationName, m.ResourcePath, resp.ObjToValue(), m.IsFault ? m.Fault : null));
        }

        private void handleInsert(CommMessage m)
        {
            PersonDB db = new PersonDB();
            Person person = new Person(m.Value);
            db.Insert(person);
            PersonResponse resp = new PersonResponse(db.Get(null));
            InputPort.SendMessage(new CommMessage(m.Id, m.OperationName, m.ResourcePath, resp.ObjToValue(), m.IsFault ? m.Fault : null));
        }

        private void handleTwice(CommMessage m)
        {
            TwiceRequest req = new TwiceRequest(m.Value);
            TwiceResponse resp = twice(req);
            InputPort.SendMessage(new CommMessage(m.Id, m.OperationName, m.ResourcePath, resp.value, m.IsFault ? m.Fault : null));
        }

        private void handleTest(CommMessage m)
        {
            Request req = new Request(m.Value);
            
            req.ID++;
            req.Name += " edited on server!";
            req.Address += "edited on serever !! address";
            req.Port--;

            Value val = req.ObjToValue();
            InputPort.SendMessage(new CommMessage(m.Id, m.OperationName, m.ResourcePath, val, m.IsFault ? m.Fault : null));
        }

        private void handleShutDown()
        {
            //InputPort.Close();
            Environment.Exit(0);
        }

        public TwiceResponse twice(TwiceRequest req)
        {
            return new TwiceResponse(req.X * 2);
        }
    }
}
