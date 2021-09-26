package com.kelaniya.uni.v5.input;

import com.kelaniya.uni.v5.operations.InvalidOperationExecption;
import com.sun.jdi.InvalidCodeIndexException;

import java.io.IOException;

public class CommandLineInputs {

    private final String[] args;

    public CommandLineInputs(String[] arguments) throws IOException {
        this.args = arguments;
    }
    public String getOperator() throws InvalidInputException {
        if (args.length == 0) {
            throw new InvalidInputException("Please provide the operation as an argument !");

        }

        String operator = args[0];

        if (!(operator.equals("sub") || operator.equals("mul") || operator.equals("add") || operator.equals("div"))) {
            throw new InvalidInputException("please add, mul, or sub as a operator");

        }
        return operator;
    }

}

