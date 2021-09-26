package com.kelaniya.uni.v5.operations;

public class InvalidOperationExecption extends Throwable {
    private static final String message = "test";

    public InvalidOperationExecption(String do_not_divide_by_zero) {
        super(message);
    }
}
