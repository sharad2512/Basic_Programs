package com.assignment1;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.println("1 st 10 Fibonacci Numbers is  :: ");
        for (int i = 0; i < 10; i++){
          c = a + b;
            System.out.println(c);
          a = b;
          b = c;
        }
    }
}