package com.Assignments;

import java.util.Scanner;

public class MaxOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int max = 0;
        int max = Integer.MIN_VALUE;
       /*
         Using Integer.MIN_VALUE instead of 0
         because user may enter negative numbers.
         If max = 0, program gives wrong answer
         when all entered numbers are negative.

        */
        while(true){
            System.out.println("Enter the number : ");
            int num = sc.nextInt();
            if(num == 0){
                break;
            }else{
                if(num>max){
                    max = num;
                }
            }
        }
        System.out.println("Maximum number is : " + max);
    }
}
