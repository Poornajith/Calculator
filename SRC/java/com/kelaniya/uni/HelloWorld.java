package com.kelaniya.uni;
public class HelloWorld {

    public static void main(String[] args){
        // make sure that the arguments are provided
        if (args.length ==0) {
            System.out.println("please provide operation as an argument");
            return;
        }
        String operator = args[0];

        // add sub mul
        // validation for if user input wrong arguments
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") )) {
            System.out.println("please provide add, sub or mul ad operator argument");
            return;
        }
                System.out.println(args[0]);
    }

}
