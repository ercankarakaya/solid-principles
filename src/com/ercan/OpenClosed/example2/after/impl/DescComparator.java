package com.ercan.OpenClosed.example2.after.impl;

import com.ercan.OpenClosed.example2.after.ValueComparator;

public class DescComparator implements ValueComparator {
    @Override
    public int compare(int val1, int val2) {
        return val2-val1;
    }
}
