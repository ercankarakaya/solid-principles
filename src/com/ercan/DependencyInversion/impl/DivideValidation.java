package com.ercan.DependencyInversion.impl;

import com.ercan.DependencyInversion.IOperationValidation;

public class DivideValidation implements IOperationValidation {
    @Override
    public boolean isValid(int a, int b) {
        System.out.print("Divide isValid : ");
        return a == 0 || b == 0 ? true : false;
    }
}
