package ro.fasttrackit.curs15.ex2;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();
    private int idNumber=0;

    public PersonService(List<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public Person addPerson(Person person) {
        persons.add(person);
        person.setId(++idNumber);
        return person;
    }

}
