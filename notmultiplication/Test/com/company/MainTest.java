package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void plus() {
        Main.Check check = new Main.Check();
        int num2 = 5;
        int num1 = 0;
        assertEquals(25, check.displayCheck(num1, num2));
    }
}