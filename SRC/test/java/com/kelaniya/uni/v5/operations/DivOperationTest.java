package com.kelaniya.uni.v5.operations;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThrows;

public class DivOperationTest {

    @Test
    public void should_divide_positive_numbers() throws InvalidOperationExecption {

        DivOperation divOperation = new DivOperation();
        Double result = divOperation.execute(new Double[]{6.0, 3.0});

        assertThat(result, is(2.0));

    }

    @Test
    public void should_divide_by_zero(){

        DivOperation divOperation = new DivOperation();
        assertThrows(InvalidOperationExecption.class, () ->{
            divOperation.execute(new Double[]{6.0, 0.0});
        });


    }


}