package com.kelaniya.uni.v5.input;

import java.io.IOException;

public class CommandLineInputs {

    private final String[] args;

    public CommandLineInputs(String[] arguments) throws IOException {
        this.args = arguments;
    }
    public String getOperator() {
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument !");
            return "";
        }

        String operator = args[0];

        if (!(operator.equals("sub") || operator.equals("mul") || operator.equals("add") || operator.equals("div"))) {
            System.out.println("please add, mul, or sub as a operator");
            return "";
        }
        return operator;
    }

}

