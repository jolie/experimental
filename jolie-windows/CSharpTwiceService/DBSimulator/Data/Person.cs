using Jolie.runtime;
using Jolie.service;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DBSimulator.Data
{
    public class Person : IJolieValue
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public Address Address { get; set; }

        public Person(Value value)
        {
            ValueToObj(value);
        }

        public Person(string firstName, string lastName, Address add)
        {
            this.FirstName = firstName;
            this.LastName = lastName;
            this.Address = add;
        }

        public void ValueToObj(Value value)
        {
            this.FirstName = value.GetChildren("firstName").First().StrValue;
            this.LastName = value.GetChildren("lastName").First().StrValue;
            this.Address = new Address(value.GetChildren("address").First());
        }

        public Value ObjToValue()
        {
            Value retval = new Value();

            ValueVector fnVec = new ValueVector();
            fnVec.add(new Value(FirstName));

            ValueVector lnVec = new ValueVector();
            lnVec.add(new Value(LastName));

            ValueVector addVec = new ValueVector();
            addVec.add(Address.ObjToValue());

            retval.Children.Add("firstName", fnVec);
            retval.Children.Add("lastName", lnVec);
            retval.Children.Add("address", addVec);

            return retval;
        }
    }
}
