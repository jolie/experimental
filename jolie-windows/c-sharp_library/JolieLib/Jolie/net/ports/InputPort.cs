using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace Jolie.net.ports
{
    public class InputPort
    {
        private readonly TcpListener listener;
        private readonly TcpClient client;
        private readonly NetworkStream stream;
        private SodepProtocol sodep;
        public IPAddress Address { get; private set; }
        public int Port { get; private set; }
        public string Protocol { get; private set; }

        public InputPort(IPAddress address, int port)
        {
            this.Address = address;
            this.Port = port;
            this.listener = new TcpListener(Address, Port);
            this.client = listener.AcceptTcpClient();
            this.stream = client.GetStream();
            this.sodep = new SodepProtocol();
            this.Protocol = "sodep";
        }
        
        public CommMessage ReceiveMessage()
        {
            return sodep.Recv(stream, stream);
        }
    }
}
