package com.Assignments;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NegativeSum = 0, PositiveEvenSum = 0,PositiveOddSum = 0 ;
        while(true){
            System.out.println("Enter the number : ");
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
           else if(num<0){
                NegativeSum = NegativeSum + num;
            }
            else if (num > 0 && num % 2 == 0){
                PositiveEvenSum = PositiveEvenSum + num;
            }else{
                PositiveOddSum = PositiveOddSum + num;
            }
        }
        System.out.println("Sum for Negative Numbers are : " + NegativeSum);
        System.out.println("Sum for Even Positive Numbers are : " + PositiveEvenSum);
        System.out.println("Sum for Odd Positive numbers are : " + PositiveOddSum);
    }
}
