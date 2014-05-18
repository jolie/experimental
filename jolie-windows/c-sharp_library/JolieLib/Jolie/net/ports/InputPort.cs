using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace Jolie.net.ports
{
    public class InputPort : JoliePort
    {
        private TcpListener listener;
        public TcpListener Listener
        {
            get { return listener; }
            set { listener = value; }
        }

        private IPAddress address;
        public IPAddress Address
        {
            get { return address; }
            set { address = value; }
        }

        public InputPort(int port) : base(port)
        {
            this.Address = IPAddress.Any;
            this.Listener = new TcpListener(Address, Port);
            this.Listener.Start();
        }

        public void Listen()
        {
            Client = Listener.AcceptTcpClient();
            Stream = Client.GetStream();
        }

        public void Close()
        {
            Stream.Close();
            Client.Close();
        }
    }
}
