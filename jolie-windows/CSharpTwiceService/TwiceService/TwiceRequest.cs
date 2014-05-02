using Jolie.runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TwiceService
{
    public class TwiceRequest
    {
        public int X { get; set; }

        public TwiceRequest(Value value)
        {
            this.X = getX(value);
        }

        private int getX(Value value)
        {
            return value.GetFirstChild("x").IntValue;
        }
    }
}
