package com.kelaniya.uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) throws IOException {
        // make sure that the arguments are provided
        if (args.length == 0) {
            System.out.println("please provide operation as an argument");
            return;
        }
        String operator = args[0];

        // add sub mul
        // validation for if user input wrong arguments
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("please provide add, sub or mul ad operator argument");
            return;
        }
        List<String> numbersStr = Files.readAllLines(
                Paths.get(
                        "G:\\SE level 2\\Semester 1\\Software const\\first git project\\Calculator\\SRC\\java\\numbers.txt"));

        double number1 = Double.parseDouble(numbersStr.get(0));
        double number2 = Double.parseDouble(numbersStr.get(1));

        double result = 0;

        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("mul")) {
            result = number1 * number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;
        }


        System.out.println(result);
    }

}

