using Jolie.runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Jolie.service
{
    public interface IJolieValue
    {
        /// <summary>
        /// Converts a Jolie value into a C# object
        /// </summary>
        /// <param name="value">The value to convert</param>
        void ValueToObj(Value value);

        /// <summary>
        /// Converts "this" object into a Jolie value
        /// </summary>
        Value ObjToValue();
    }
}
