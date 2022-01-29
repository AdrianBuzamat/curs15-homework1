package ro.fasttrackit.curs15.ex2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
}
