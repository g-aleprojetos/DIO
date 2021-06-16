package com.aleprojetos.g.teste.com.java.JUnit;


import org.junit.Test;

import static org.junit.Assert.*;

public class AssersTest {

    @Test
    public void testAssertArrayEquals(){
        byte[] esperando = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperando, atual);
    }

    @Test
    public void testAssertEquals(){
        assertEquals("text", "text");
    }

    @Test
    public void TestAssertFalse(){
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame(){
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void TestAssertNull(){
        assertNull(null);
    }

    @Test
    public void testAssertSame(){
        Integer aNumber = Integer.valueOf(765);
        assertSame(aNumber, aNumber);
    }
}
