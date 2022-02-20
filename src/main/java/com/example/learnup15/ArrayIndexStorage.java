package com.example.learnup15;

class ArrayIndexStorage extends IndexStorage {

    private int[] arrayInts;

    public ArrayIndexStorage(int[] arrayInts) {
        super(arrayInts.length);
        this.arrayInts = arrayInts;
    }

    @Override
    public int get(int index) {
        return arrayInts[index];
    }

}