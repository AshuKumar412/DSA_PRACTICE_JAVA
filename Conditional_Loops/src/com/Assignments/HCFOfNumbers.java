package com.Assignments;

import java.util.Scanner;

public class HCFOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        int factors;
        if(num1 > num2){
            factors = num2;     // for HCF we need smallest number  (HCF cannot greater than smallest number)
        }else{
            factors = num1;
        }
        int max = 1;   // 1 is always common factor because 1 is divisible by every number

        for(int i = 1; i<=factors; i++){    // loop runs till smallest number

            if(num1 % i == 0 && num2 % i == 0){   // check i is common factor for both numbers or not
                max = i;   // loop rus till end so max stores and update i till latst which is the largest common factor which becomes HCH or GCD
            }

        }

        System.out.println("HCF is : " + max);
    }
}
