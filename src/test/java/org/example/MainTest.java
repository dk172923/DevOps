package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testWelcomeMessage() {
        assertEquals("Hello and welcome!", Main.welcomeMessage());
    }
}
