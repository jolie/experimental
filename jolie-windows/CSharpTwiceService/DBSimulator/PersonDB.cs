using DBSimulator.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DBSimulator
{
    public class PersonDB
    {
        private List<Person> personTable;
        public List<Person> PersonTable
        {
            get
            {
                if (personTable == null) personTable = new List<Person>();
                return personTable;
            }
            set { personTable = value; }
        }

        public PersonDB()
        {
            PersonTable = new List<Person>();
            populateSampleData();
        }

        public bool Insert(Person person)
        {
            PersonTable.Add(person);
            return true;
        }

        public bool Delete(Person person)
        {
            PersonTable.Remove(person);
            return true;
        }

        public List<Person> Get(Person person)
        {
            if (person == null) return PersonTable;

            List<Person> retval = new List<Person>();
            Person p = PersonTable.FirstOrDefault(x => x.FirstName == person.FirstName && x.LastName == person.LastName);
            if (p != null)
            {
                retval.Add(p);
                return retval;
            }
            else
            {
                return PersonTable;
            }
        }

        private void populateSampleData()
        {
            PersonTable.Clear();

            Address add1 = new Address("Baker Street", 21, 8889, "London");
            Address add2 = new Address("Second Street", 44, 8821, "New York");
            Address add3 = new Address("Rued Langgaardsvej", 7, 2300, "Copenhagen");

            Person p1 = new Person("Sherlock", "Holmes", add1);
            Person p2 = new Person("Chuck", "Norris", add2);
            Person p3 = new Person("IT", "University", add3);
            Person p4 = new Person("James", "Bond", add2);

            PersonTable.Add(p1);
            PersonTable.Add(p2);
            PersonTable.Add(p3);
            PersonTable.Add(p4);

        }
    }
}
