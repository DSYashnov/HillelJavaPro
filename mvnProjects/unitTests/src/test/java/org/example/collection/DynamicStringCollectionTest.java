package org.example.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DynamicStringCollectionTest {

    @Test
    void add() {
        DynamicStringCollection col = new DynamicStringCollection();
        assertEquals(0, col.size());
        String str = "element";
        assertTrue(col.add(str));
        assertEquals(1, col.size());
        assertEquals(str, col.get(0));
        assertTrue(col.contain(str));
    }

    @Test
    void testAdd_valid() {
        DynamicStringCollection col = new DynamicStringCollection();
        assertEquals(0, col.size());
        String str = "element";
        assertTrue(col.add(0, str));
        assertEquals(1, col.size());
        assertEquals(str, col.get(0));
        assertTrue(col.contain(str));
    }
    @Test
    void testAdd_invalid_index_less_zero() {
        DynamicStringCollection col = new DynamicStringCollection();
        assertEquals(0, col.size());
        String str = "element";
        assertFalse(col.add(-1, str));
        assertEquals(0, col.size());
    }
    @Test
    void testAdd_invalid_index_more_than_size() {
        DynamicStringCollection col = new DynamicStringCollection();
        assertEquals(0, col.size());
        String str = "element";
        assertFalse(col.add(1, str));
        assertEquals(0, col.size());
    }

    @Test
    void delete() {
    }

    @Test
    void get_valid() {
        DynamicStringCollection col = new DynamicStringCollection();
        String str = "element";
        assertTrue(col.add(str));
        assertEquals(str, col.get(0));
    }
    @Test
    void get_invalid_exception_negative_index() {
        DynamicStringCollection col = new DynamicStringCollection();
        assertThrows(IndexOutOfBoundsException.class, () -> col.get(-1));
    }
    @Test
    void get_invalid_exception_positive_index() {
        DynamicStringCollection col = new DynamicStringCollection();
        assertThrows(IndexOutOfBoundsException.class, () -> col.get(1));
    }

    @Test
    void contain() {
    }

    @Test
    void testEquals() {
        DynamicStringCollection col = new DynamicStringCollection();
        col.add("one");
        col.add("two");

        DynamicStringCollection col1 = new DynamicStringCollection();
        col1.add("one");
        col1.add("two");

        assertTrue(col.equals(col1));
    }
    @Test
    void testEquals_null() {
        DynamicStringCollection col = new DynamicStringCollection();
        col.add("one");
        col.add("two");

        assertFalse(col.equals(null));
    }

    @Test
    void testEquals_type() {
        DynamicStringCollection col = new DynamicStringCollection();
        col.add("one");
        col.add("two");

        assertFalse(col.equals(new ArrayList<>()));
    }

    @Test
    void testEquals_diff_size() {
        DynamicStringCollection col = new DynamicStringCollection();
        col.add("one");
        col.add("two");

        DynamicStringCollection col1 = new DynamicStringCollection();
        col1.add("one");

        assertFalse(col.equals(col1));
    }

    @Test
    void clear() {
    }

    @Test
    void size() {
    }
}