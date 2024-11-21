package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    @Tag("calc")
    @DisplayName("Додавання")
    void add() {
        assertEquals(4, new Calc().add(2, 2));
    }

    @Test
    @Tag("calc")
    @DisplayName("Ділення")
    void div() {
        assertEquals(1, new Calc().div(2, 2));
    }

    @Test
    @Tag("div")
    @DisplayName("Ділення на нуль")
    void divByZero() {
        assertThrows(ArithmeticException.class,() -> new Calc().div(2, 0));
    }

    @Test
    @Tag("calc")
    @DisplayName("Віднімання")
    void sub() {
        assertEquals(0, new Calc().sub(2, 2));
    }

    @Test
    @Tag("calc")
    @DisplayName("Множення")
    void multiply() {
        assertEquals(4, new Calc().multiply(2, 2));
    }
}