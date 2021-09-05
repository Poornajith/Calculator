package com.kelaniya.uni.v3;

import com.kelaniya.uni.v3.operations.AddOperation;
import com.kelaniya.uni.v3.operations.MulOperation;
import com.kelaniya.uni.v3.operations.SubOperation;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs commandLineInputs = new CommandLineInputs( args );
        String operator = commandLineInputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        double result = 0;

        if (operator.equals("add")) {

            AddOperation addOperation = new AddOperation();
            result = addOperation.execute(numbers);

        } else if (operator.equals("sub")) {

            SubOperation subOperation = new SubOperation();
            result = subOperation.execute(numbers);

        } else {

            MulOperation mulOperation = new MulOperation();
            result = mulOperation.execute(numbers);

        }

        System.out.println(result);
    }
}