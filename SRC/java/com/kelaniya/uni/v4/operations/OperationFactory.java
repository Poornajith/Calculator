package com.kelaniya.uni.v4.operations;

import jdk.dynalink.Operation;

//Factory design pattern
public class OperationFactory {
    public Operation getInstance(String operator) {

    Operation operation = null;

        if (operator.equals("add")) {
        operation= new AddOperation();

    } else if (operator.equals("sub")) {
        operation = new SubOperation();


    } else {
            operation = new MulOperation();
        }

    }
}
