using Jolie.runtime;
using Jolie.service;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TwiceService
{
    public class TwiceRequest : IJolieValue
    {
        public int X { get; set; }

        public TwiceRequest(Value value)
        {
            ValueToObj(value);
        }

        public TwiceRequest(int x)
        {
            this.X = x;
        }

        public void ValueToObj(Value value)
        {
            this.X = value.GetFirstChild("x").IntValue;
        }

        public Value ObjToValue()
        {
            Value retval = new Value();
            ValueVector xVec = new ValueVector();
            xVec.add(new Value(X));
            retval.Children.Add("x", xVec);
            return retval;
        }
    }
}
