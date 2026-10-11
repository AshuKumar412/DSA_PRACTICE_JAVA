package com.Assignments;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long num = sc.nextLong();
        long fact =1;
        while (num>0){
            fact = fact*num;
            num--;
        }
        System.out.println("Factorial of the number : " + fact);
    }
}
