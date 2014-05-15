using Jolie.runtime;
using Jolie.service;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DBSimulator.Data
{
    public class Address : IJolieValue
    {
        public string StreetName { get; set; }
        public int StreetNumber { get; set; }
        public int ZipCode { get; set; }
        public string City { get; set; }

        public Address(Value value)
        {
            ValueToObj(value);
        }

        public Address(string sName, int sNumber, int zip, string city)
        {
            this.StreetName = sName;
            this.StreetNumber = sNumber;
            this.ZipCode = zip;
            this.City = city;
        }

        public void ValueToObj(Value value)
        {
            this.StreetName = value.GetChildren("streetName").First().StrValue;
            this.StreetNumber = value.GetChildren("streetNumber").First().IntValue;
            this.ZipCode = value.GetChildren("zipCode").First().IntValue;
            this.City = value.GetChildren("city").First().StrValue;
        }

        public Value ObjToValue()
        {
            Value retval = new Value();

            ValueVector sNameVec = new ValueVector();
            sNameVec.add(new Value(StreetName));

            ValueVector sNumberVec = new ValueVector();
            sNumberVec.add(new Value(StreetNumber));

            ValueVector zipVec = new ValueVector();
            zipVec.add(new Value(ZipCode));

            ValueVector cityVec = new ValueVector();
            cityVec.add(new Value(City));

            retval.Children.Add("streetName", sNameVec);
            retval.Children.Add("streetNumber", sNumberVec);
            retval.Children.Add("zipCode", zipVec);
            retval.Children.Add("city", cityVec);

            return retval;
        }
    }
}
