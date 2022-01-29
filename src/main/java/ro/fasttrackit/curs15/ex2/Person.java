package ro.fasttrackit.curs15.ex2;

import java.util.Objects;

public class Person {
    private int id;
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name=validateNotEmpty(name);
        this.age=validateAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = validateId(id);
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String validateNotEmpty(String word) throws IllegalArgumentException {
        if (word == null || "".equals(word.trim())) {
            throw new IllegalArgumentException("Insert valid name");
        } else {
            return word;
        }
    }

    private int validateAge(int age) throws IllegalArgumentException {
        if (age > 0 & age < 110) {
            return age;
        } else {
            throw new IllegalArgumentException("Insert valid age");
        }
    }

    private int validateId(int id) throws IllegalArgumentException {
        if (id > 0) {
            return id;
        } else {
            throw new IllegalArgumentException("Invalidated ID");
        }
    }
}
