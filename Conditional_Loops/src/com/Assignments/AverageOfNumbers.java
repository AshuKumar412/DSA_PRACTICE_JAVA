package com.Assignments;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total count of numbers : ");
        int num = sc.nextInt();
        int sum =0;
        for(int i =0; i<=num; i++){
            System.out.println("Enter number : ");
            int n = sc.nextInt();
            sum = sum+n;
        }
        double average = (double)sum/num;     // Converting sum to double so division returns decimal result instead of integer value (Type Casting)


        System.out.println("Average of number is : " +average);
    }
}
