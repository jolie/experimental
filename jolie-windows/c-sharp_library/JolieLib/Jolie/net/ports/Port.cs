using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace Jolie.net.ports
{
    public class JoliePort
    {
        private TcpClient client;
        public TcpClient Client 
        { 
            get { return client; }
            set { client = value; }
        }

        private NetworkStream stream;
        public NetworkStream Stream 
        {
            get { return stream; }
            set { stream = value; }
        }

        private SodepProtocol sodep;
        public SodepProtocol Sodep 
        { 
            get { return sodep; }
            set { sodep = value; }
        }

        private int port;
        public int Port 
        { 
            get { return port; }
            set { port = value; }
        }

        public string Protocol = "sodep";

        public JoliePort(int port)
        {
            this.Port = port;
            this.Sodep = new SodepProtocol();
        }

        public void SendMessage(CommMessage msg)
        {
            Sodep.Send(Stream, msg, Stream);
        }

        public CommMessage ReceiveMessage()
        {
            return Sodep.Recv(Stream, Stream);
        }

    }
}
