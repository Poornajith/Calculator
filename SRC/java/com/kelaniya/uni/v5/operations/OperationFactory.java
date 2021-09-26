package com.kelaniya.uni.v5.operations;

//Factory design pattern
public class OperationFactory {
    public Operation getInstance(String operator) {

        Operation operation = null;

        if (operator.equals("add")) {
            operation = (Operation) new AddOperation();

        } else if (operator.equals("sub")) {
            operation = (Operation) new SubOperation();

        } else if (operator.equals("div")) {
            operation = (Operation) new DivOperation();

        } else {
            operation = (Operation) new MulOperation();
        }
        return operation;
    }
}