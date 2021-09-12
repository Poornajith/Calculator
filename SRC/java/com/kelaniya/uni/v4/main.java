package com.kelaniya.uni.v4;

import com.kelaniya.uni.v4.operations.*;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs commandLineInputs = new CommandLineInputs(args);
        String operator = commandLineInputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation =operationFactory.getInstance(operator);

        Double result = operation.execute(numbers);

        UI ui= new UI();
        ui.showMessage("The result is :" + result);

    }
}