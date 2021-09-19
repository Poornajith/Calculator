package com.kelaniya.uni.v5.operations;

public class DivOperation {
    public Double execute(Double[] numbers) throws InvalidOperationExecption {

        if (numbers[1] == 0) {
            throw new InvalidOperationExecption("Do not divide by zero");
        }

        return numbers[0] / numbers[1];

    }
}
