package ro.fasttrackit.curs15.ex2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PersonTest {
    @Test
    @DisplayName("WHEN a person is created and age is not real THEN throw exception")
    void testInvalidAge() {
        //RUN
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                () -> new Person("marin", -155));
        assertThat(exc.getMessage()).isEqualTo("Insert valid age");
    }

    @Test
    @DisplayName("When a person is created and name is empty THEN throw exception")
    void testEmptyName() {
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                () -> new Person("", 33));
        assertThat(exc.getMessage()).isEqualTo("Insert valid name");
    }

    @Test
    @DisplayName("When a person is created and name is null THEN throw exception")
    void testNullName() {
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                () -> new Person(null, 33));
        assertThat(exc.getMessage()).isEqualTo("Insert valid name");
    }

    @Test
    @DisplayName("WHEN an negative ID is given THEN throw exception")
    void testValidID() {
        Person person = new Person("marin", 33);
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                () -> person.setId(-22));
        assertThat(exc.getMessage()).isEqualTo("Invalidated ID");
    }
}
