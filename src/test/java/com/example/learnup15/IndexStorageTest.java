package com.example.learnup15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexStorageTest {

    IndexStorage indexStorage = new IndexStorage(3);

    @Test
    void size() {
        assertEquals(3, indexStorage.size());
    }

    @Test
    void get() {
        assertEquals(0, indexStorage.get(0));
    }

    @Test
    void reverse() {
        int[] reverseInt = indexStorage.reverse();
        assertEquals(2, reverseInt[0]);
    }

}