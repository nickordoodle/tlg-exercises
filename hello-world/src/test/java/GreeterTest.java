package test.java;

import main.java.Greeter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void testThatGreeterReturnsTheCorrectGreeting() {
        assertEquals("Hello, World!", new Greeter().getGreeting());
    }

}
