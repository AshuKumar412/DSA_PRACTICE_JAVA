package com.Assignments;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers : ");
        int num = sc.nextInt();
        int originalNumber = num;
        int count = 0, sum = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        num = originalNumber;

        while(num>0){
            int digit = num%10;
            sum = sum + (int)Math.pow(digit, count);
            num = num/10;
        }
        if(sum == originalNumber){
            System.out.println(originalNumber + " is an Armstrong number");
        }else{
            System.out.println(originalNumber + " is not Armstrong Number");
        }
    }
}
