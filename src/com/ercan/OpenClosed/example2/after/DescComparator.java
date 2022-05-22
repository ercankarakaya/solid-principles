package com.ercan.OpenClosed.example2.after;

public class DescComparator implements ValueComparator{
    @Override
    public int compare(int val1, int val2) {
        return val2-val1;
    }
}
