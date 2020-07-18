package com.ercan.DependencyInversion.impl;

import com.ercan.DependencyInversion.IOperationValidation;

public class SumValidation implements IOperationValidation {


    @Override
    public boolean isValid(int a, int b) {
        System.out.print("Sum isValid : ");
        return a < 0 || b < 0 ? true : false;
    }
}
