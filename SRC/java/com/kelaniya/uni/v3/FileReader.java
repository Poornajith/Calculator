package com.kelaniya.uni.v3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public Double[] getNumbers() throws IOException {

        List<String> numbers = Files.readAllLines( Paths.get(
                "G:\\SE level 2\\Semester 1\\Software const\\first git project\\Calculator\\SRC\\java\\numbers.txt"));

        double number1 = Double.parseDouble(numbers.get(0));
        double number2 = Double.parseDouble(numbers.get(1));

        return new Double[]{ number1, number2 };

    }

}
