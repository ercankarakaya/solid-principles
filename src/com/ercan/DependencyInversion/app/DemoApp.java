package com.ercan.DependencyInversion.app;

import com.ercan.DependencyInversion.IOperationValidation;
import com.ercan.DependencyInversion.Validation;
import com.ercan.DependencyInversion.impl.DivideValidation;
import com.ercan.DependencyInversion.impl.SumValidation;

public class DemoApp {
    public static void main(String[] args) {

        IOperationValidation iOperationValidation=new SumValidation();
        Validation validation=new Validation(iOperationValidation);
        System.out.println(validation.isValid(-4,5));

        iOperationValidation=new DivideValidation();
        validation=new Validation(iOperationValidation);
        System.out.println(validation.isValid(4,2));

    }
}
