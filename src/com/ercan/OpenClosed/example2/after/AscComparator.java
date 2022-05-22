package com.ercan.OpenClosed.example2.after;

public class AscComparator implements ValueComparator{

    @Override
    public int compare(int val1, int val2) {
        return val1-val2;
    }
}
