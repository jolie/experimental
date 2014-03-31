using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace Jolie.net.ports
{
    public class OutputPort
    {
        private readonly TcpClient client;
        private readonly Stream stream;
        private readonly SodepProtocol sodep;
        public string Address { get; private set; }
        public int Port { get; private set; }
        public string Protocol { get; private set; }

        public OutputPort(string address, int port)
        {
            this.Protocol = "sodep";
            this.Address = address;
            this.Port = port;
            client = new TcpClient(Address, Port);
            stream = client.GetStream();
            sodep = new SodepProtocol();
        }

        public void SendMessage(CommMessage msg)
        {
            sodep.Send(stream, msg, stream);
        }
    }
}
