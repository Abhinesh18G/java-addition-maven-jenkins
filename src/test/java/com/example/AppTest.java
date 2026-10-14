
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {
        assertEquals(30, App.add(10, 20));
    }

    @Test
    void testAdditionWithNegativeNumber() {
        assertEquals(5, App.add(10, -5));
    }

    @Test
    void testAdditionWithZero() {
        assertEquals(7, App.add(7, 0));
    }
}
