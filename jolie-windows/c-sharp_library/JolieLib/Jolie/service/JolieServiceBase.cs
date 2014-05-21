using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Jolie.service
{
    public abstract class JolieServiceBase
    {
        public void ShutDown()
        {
            Environment.Exit(0);
        }

        public abstract void Start();
    }
}
