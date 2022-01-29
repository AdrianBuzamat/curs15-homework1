package ro.fasttrackit.curs15.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();
    private int idNumber = 0;

    public PersonService(List<Person> persons) {
        if (persons != null) {
            for (Person person : persons) {
                this.addPerson(person);
            }
        }
    }

    public Person addPerson(Person person) {
        persons.add(person);
        person.setId(++idNumber);
        return person;
    }

    public Person removePerson(int id) {
        Person result = null;
        for (Person person : persons) {
            if (person.getId() == id) {
                result = person;
                persons.remove(person);
                break;
            }
        }
        if (result==null){
            throw new IllegalArgumentException("Person with this ID was not found!");
        }
        return result;
    }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PersonService that = (PersonService) o;
            return idNumber == that.idNumber && Objects.equals(persons, that.persons);
        }

        @Override
        public int hashCode () {
            return Objects.hash(persons, idNumber);
        }

        @Override
        public String toString () {
            return "PersonService{" +
                    "persons=" + persons +
                    ", idNumber=" + idNumber +
                    '}';
        }
    }
