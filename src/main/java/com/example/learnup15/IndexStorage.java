package com.example.learnup15;

public class IndexStorage {

    private int sizeStorage;

    public IndexStorage(int sizeStorage) {
        this.sizeStorage = sizeStorage;
    }

    public int size() {
        return sizeStorage;
    }

    public int get(int index) {
        return index % 2 == 0 ? index : -index;
    }

    public int[] reverse() {
        int[] intArray = new int[sizeStorage];
        for (int i = 1; i < sizeStorage + 1; i++) {
            intArray[sizeStorage - i] = get(i - 1);
        }
        return intArray;
    }

}