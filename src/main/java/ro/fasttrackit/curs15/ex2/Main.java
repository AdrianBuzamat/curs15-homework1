package ro.fasttrackit.curs15.ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService(List.of(
                new Person("Dorel", 22),
                new Person("Gigel", 23),
                new Person("Firicel", 24),
                new Person("Marcel", 25),
                new Person("Costel", 26)
        ));

        //System.out.println(personService.toString());
        System.out.println(personService.removePerson(2));
        System.out.println(personService.getAllPersons());
    }
}
