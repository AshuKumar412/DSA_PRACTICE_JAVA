package com.Assignments;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the power : ");
        int pow = sc.nextInt();
        int mul = 1;

        for(int i=1; i<=pow; i++){
            mul = num*mul;
        }

        System.out.println("Power of a Number is : " +mul);
    }
}
