package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FibonacciGenerator generator = new FibonacciGenerator();
        generator.printNFibonacciNumbers(
                Integer.valueOf(args[0])
        );
    }
}

