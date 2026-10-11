package com.Assignments;

import java.util.Scanner;

public class LCMOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        int factors;

        if(num1>num2){
            factors = num1;
        }else{
            factors = num2;
        }
        while(true){
            if(factors%num1 == 0 && factors%num2 == 0){
                break;
            }
            factors++;
        }
        System.out.println("LCM of "+num1+" and " + num2+ " is : " + factors);
    }
}
