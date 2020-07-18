package com.ercan.DependencyInversion;

public class Validation {

    private IOperationValidation iOperationValidation;

    public Validation(IOperationValidation iOperationValidation) {
        this.iOperationValidation = iOperationValidation;
    }

    public boolean isValid(int a, int b) {
        return iOperationValidation.isValid(a, b);
    }
}
