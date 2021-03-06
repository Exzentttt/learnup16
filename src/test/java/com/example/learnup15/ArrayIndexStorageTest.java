package com.example.learnup15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIndexStorageTest {

    ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(new int[]{1, 2, 3, 4});

    @Test
    void size() {
        assertEquals(4, arrayIndexStorage.size());
    }

    @Test
    void get() {
        assertEquals(1, arrayIndexStorage.get(0));
    }

    @Test
    void reverse() {
        int[] reverseInt = arrayIndexStorage.reverse();
        assertEquals(4, reverseInt[0]);
    }

}