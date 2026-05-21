package com.Assignments;

import java.util.Scanner;

public class FactorsOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int count = 0, i;
        for(i=1; i<=Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                count++;

                if(i != (num/i)){
                    System.out.println((num/i) + " ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Enter total factors : " + count);
    }
}
