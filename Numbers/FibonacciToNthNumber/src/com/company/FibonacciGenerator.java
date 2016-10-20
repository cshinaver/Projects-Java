package com.company;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {
    int index;
    List<Integer> numbers;

    public FibonacciGenerator() {
        index = 0;
        numbers = new ArrayList<>();
    }

    private Integer nextNumber() {
        int next;
        if (index < 2) {
            next = 1;
        } else {
            next = numbers.get(index - 1) +  numbers.get(index - 2);
        }
        return next;
    }

    private List<Integer> generateNumbers(Integer total) {
        for (int i = 0; i < total; i++) {
            Integer next = nextNumber();
            appendNumber(next);
        }
        return numbers;
    }

    private void appendNumber(Integer next) {
        numbers.add(next);
        index++;
    }

    public void printNFibonacciNumbers(Integer total) {
        generateNumbers(total);
        for (Integer number : numbers)
            System.out.print(number + " ");
    }
}
