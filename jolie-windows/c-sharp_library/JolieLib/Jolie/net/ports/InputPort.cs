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
        public TcpListener Listener { get { return listener; } }
        private TcpClient client;
        public TcpClient Client { get { return client; } }
        private NetworkStream stream;
        public NetworkStream Stream { get { return stream; } }
        private SodepProtocol sodep;
        public IPAddress Address { get; private set; }
        public int Port { get; private set; }
        public string Protocol { get; private set; }

        public InputPort(int port)
        {
            //Console.WriteLine("Initializing input port");
            this.Address = IPAddress.Any;
            this.Port = port;
            this.listener = new TcpListener(Address, Port);
            this.listener.Start();
            this.sodep = new SodepProtocol();
            this.Protocol = "sodep";
            //Console.WriteLine("Inputport ready");
            //this.client = listener.AcceptTcpClient();
            //this.stream = client.GetStream();
        }

        public void Listen()
        {
            this.client = listener.AcceptTcpClient();
            this.stream = client.GetStream();
        }

        public void Close()
        {
            this.Stream.Close();
            this.Client.Close();
        }

        public CommMessage ReceiveMessage()
        {
            return sodep.Recv(stream, stream);
        }

        public void SendMessage(CommMessage m)
        {
            sodep.Send(stream, m, stream);
        }
    }
}
