using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace Jolie.net.ports
{
    public class OutputPort : JoliePort
    {
        private string address;
        public string Address
        {
            get { return address; }
            set { address = value; }
        }

        public OutputPort(string address, int port) : base(port)
        {
            this.Address = address;
        }
    }
}
