package com.assignment1;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int x = 0;
        while (num > 0) {
            int rem = num % 10;
            x = (x) + (rem * rem * rem);
            num = num / 10;
        }
        if (temp == x) {
            System.out.println(temp +" It is Armstrong No.");
        } else {
            System.out.println( temp + " It is not an Armstrong No.");
        }
    }
}
