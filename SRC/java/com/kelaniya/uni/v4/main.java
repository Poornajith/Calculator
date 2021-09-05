package com.kelaniya.uni.v4;

import com.kelaniya.uni.v4.operations.AddOperation;
import com.kelaniya.uni.v4.operations.MulOperation;
import com.kelaniya.uni.v4.operations.OperationFactory;
import com.kelaniya.uni.v4.operations.SubOperation;
import jdk.dynalink.Operation;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs commandLineInputs = new CommandLineInputs( args );
        String operator = commandLineInputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        OperationFactory operationFactory = new OperationFactory();
        OperationFactory operation = operationFactory.getInstance(operator);

        Double result = operation.execute(numbers);

        UI ui= new UI();
        ui.showMessage("The result is :" + result);

    }
}