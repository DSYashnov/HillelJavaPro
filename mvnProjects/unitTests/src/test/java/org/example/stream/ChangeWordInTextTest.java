package org.example.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeWordInTextTest {

    static String TEXT = "test_word";
    static String TEXT_EXAMPLE = "test word";
    static String EXP_EXAMPLE = "test_word test_word";

    @Test
    void changeWordInText() {
        ChangeWordInText cw = new ChangeWordInText();
        assertTrue(EXP_EXAMPLE.equals(cw.changeWord(TEXT_EXAMPLE, TEXT, 4L)));
        assertEquals(EXP_EXAMPLE, cw.changeWord(TEXT_EXAMPLE, TEXT, 4L));
    }
    @Test
    void changeWordInTextNothing() {
        ChangeWordInText cw = new ChangeWordInText();
        assertTrue(TEXT_EXAMPLE.equals(cw.changeWord(TEXT_EXAMPLE, TEXT, 5L)));
        assertEquals(TEXT_EXAMPLE, cw.changeWord(TEXT_EXAMPLE, TEXT, 5L));
    }
}