using Jolie.runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TwiceService
{
    public class Request
    {
        //public int X { get; set; }

        //public TwiceRequest(Value value)
        //{
        //    this.X = getX(value);
        //}

        //private int getX(Value value)
        //{
        //    return value.GetFirstChild("x").IntValue;
        //}

        public Request(Value value)
        {
            ValueToObj(value);
        }

        public int ID { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }
        public int Port { get; set; }

        public void ValueToObj(Value value)
        {
            this.ID = value.GetChildren("id").First().IntValue;
            this.Name = value.GetChildren("name").First().StrValue;
            this.Address = value.GetChildren("location").First().GetChildren("address").First().StrValue;
            this.Port = value.GetChildren("location").First().GetChildren("port").First().IntValue;
        }

        public Value ObjToValue()
        {
            Value retVal = new Value();

            ValueVector id = new ValueVector();
            id.add(new Value(ID));

            ValueVector name = new ValueVector();
            name.add(new Value(Name));

            ValueVector address = new ValueVector();
            address.add(new Value(Address));

            ValueVector port = new ValueVector();
            port.add(new Value(Port));

            ValueVector location = new ValueVector();
            Value locValue = new Value();
            location.add(locValue);
            locValue.Children.Add("address", address);
            locValue.Children.Add("port", port);

            retVal.Children.Add("id", id);
            retVal.Children.Add("name", name);
            retVal.Children.Add("location", location);

            return retVal;
        }
    }
}
