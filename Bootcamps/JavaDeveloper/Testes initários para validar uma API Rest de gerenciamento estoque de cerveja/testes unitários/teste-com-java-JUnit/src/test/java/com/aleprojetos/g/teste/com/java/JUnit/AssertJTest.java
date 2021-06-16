package com.aleprojetos.g.teste.com.java.JUnit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertJTest {
    @Test
    public void checkEquality() {
        Person person= new Person("Barrack", "Obama");
        Person personClone = person;
      //  Person personClone = new Person("Barrack", "Obama");

        assertThat(person).isEqualTo(personClone);
    }


}
