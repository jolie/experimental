using Jolie.runtime;
using Jolie.service;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DBSimulator.Data
{
    public class PersonResponse : IJolieValue
    {
        public List<Person> Persons { get; set; }

        public PersonResponse(List<Person> persons)
        {
            this.Persons = persons;
        }

        public void ValueToObj(Jolie.runtime.Value value)
        {
            ValueVector vec = value.GetChildren("persons");
            for(int i = 0; i < vec.Size(); i++)
            {
                Persons.Add(new Person(vec.Get(i)));
            }
        }

        public Jolie.runtime.Value ObjToValue()
        {
            Value retval = new Value();
            
            ValueVector cur = new ValueVector();


            foreach(Person p in Persons)
            {
                cur.add(p.ObjToValue());
            }

            retval.Children.Add("personList", cur);
            return retval;
        }
    }
}
