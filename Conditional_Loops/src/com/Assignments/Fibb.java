package com.Assignments;

import java.util.Scanner;

public class Fibb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;
        int next = 0;
        int sum = 0;
        while(count<num){
            System.out.print(a + " ");    // Print Fibbonaci series
            sum = sum+a;
            next = a+b;
            a=b;
            b = next;
            count++;
        }
        System.out.println();
        System.out.println("Total Sum of fibbonaci series are : " + sum);  // Total sum of the series
    }
}
