using Jolie.runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TwiceService
{
    public class TwiceResponse
    {
        public Value value;

        public TwiceResponse(int y)
        {
            this.value = new Value();
            createValueObject(y);
        }

        private void createValueObject(int y)
        {
            ValueVector vv = new ValueVector();
            vv.add(new Value(y));
            this.value.Children.Add("y", vv);
        }
    }
}
