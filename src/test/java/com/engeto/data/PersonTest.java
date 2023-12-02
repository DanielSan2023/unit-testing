package com.engeto.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Daniel", "San", 39);
    }

    @Test
    void getName() {
        String actual = person.getName();
        String expected = "Daniel";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setName() {
        person.setName("Charles");
        String actual = person.getName();
        String expected = "Charles";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSurename() {
        String actual = person.getSurename();
        String expected = "San";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setSurename() {
        person.setSurename("Dickens");
        String actual = person.getSurename();
        String expected = "Dickens";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test if person1 = null")
    void setSurenameNull() {
        Person person1 = new Person();
        String expected = person1.getSurename();
        Assertions.assertNull(expected);
    }

    @Test
    void getAge() {
        int actual = person.getAge();
        int expected = 39;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void setAge() {
        person.setAge(35);
        int expected = 35;
        int actual = person.getAge();
        Assertions.assertEquals(expected, actual);
    }
}