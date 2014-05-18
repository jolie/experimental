using Jolie.runtime;
using Jolie.service;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TwiceService
{
    public class TwiceResponse : IJolieValue
    {
        //public Value value;
        public int Y { get; set; }

        public TwiceResponse(Value value)
        {
            ValueToObj(value);
        }

        public TwiceResponse(int y)
        {
            this.Y = y;
        }

        public void ValueToObj(Value value)
        {
            this.Y = value.GetFirstChild("y").IntValue;
        }

        public Value ObjToValue()
        {
            Value retval = new Value();
            ValueVector yVec = new ValueVector();
            yVec.add(new Value(Y));
            retval.Children.Add("y", yVec);
            return retval;
        }
    }
}
