package com.queenie;

// Example of a class in Java
public class Calculator {
    // NAMING: Everything BUT CLASSES must use camel casing
    // Requires function and argument data types to be specified
    public int add(int n1, int n2) {
        // Return data type must match declared function data type
        int result = n1 + n2;
        return result;
    }

    // Return can also be inline, since only 1 line in the code
    public int addInline(int n1, int n2) {
        return n1 + n2;
    }

    public enum Nationality {
        ITALIAN, BRITISH, KOREAN, ALGERIAN, CHINESE;
    }

    // void - no return needed
    public void isEven(int number) {
        System.out.println(number % 2 == 0);
        System.out.println(Nationality.ITALIAN);
    }

}


