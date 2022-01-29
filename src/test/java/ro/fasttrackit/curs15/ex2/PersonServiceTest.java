package ro.fasttrackit.curs15.ex2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonServiceTest {
    @Test
    @DisplayName("WHEN a person is created THEN add to the list and set an ID")
    void testAddPerson(){
        PersonService personService = new PersonService(List.of());
        Person person = new Person("Dorel", 22);
        person.setId(1);
        Person actual= personService.addPerson(person);
        assertThat(actual.getId()).isEqualTo(1);
    }
    @Test
    @DisplayName("WHEN ID number does not exist THEN throw exception")
    void testRemovePerson(){
        PersonService personService = new PersonService(List.of(
                new Person("Dorel", 22),
                new Person("Gigel", 23),
                new Person("Firicel", 24),
                new Person("Marcel", 25),
                new Person("Costel", 26)
        ));
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                () -> personService.removePerson(30));
        assertThat(exc.getMessage()).isEqualTo("Person with this ID was not found!");
    }
    @Test
    @DisplayName("WHEN display list is requested THEN must return the whole list")
    void getAllPersons(){
        PersonService personService = new PersonService(List.of(
                new Person("Dorel", 22),
                new Person("Gigel", 23)
        ));


        List<Person> actual = personService.getAllPersons();
        assertThat(actual).hasSize(2).containsExactlyInAnyOrder(
                new Person("Dorel", 22),
                new Person("Gigel", 23)
        );
    }

}
