package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };
        System.out.println(square.apply(5));


        int numero =4;
        System.out.println("numero to test: "+ numero);
        Function<Integer,Boolean> isOdd = x -> x%2 == 1;
        System.out.println("Function is odd");
        System.out.println(isOdd.apply(numero));

        Predicate<Integer> isEven = x -> x%2 == 0;
        System.out.println("Predicate is even");
        System.out.println(isEven.test(numero));

    }
}
