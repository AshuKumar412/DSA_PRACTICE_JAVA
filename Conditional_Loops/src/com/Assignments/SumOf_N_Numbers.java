package com.Assignments;

import java.util.Scanner;

public class SumOf_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N natural numbers : ");
        int num = sc.nextInt();
        int sum =0;
        for(int i=0; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("Sum of numbers are : " + sum);
    }
}
