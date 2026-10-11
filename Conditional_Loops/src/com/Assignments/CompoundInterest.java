package com.Assignments;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle amount : ");
        float principleAmount = sc.nextFloat();
        System.out.println("Enter rate of interest (in %) : ");
        float interestRate = sc.nextFloat();
        System.out.println("Enter time period (in years) : ");
        float timePeriod = sc.nextFloat();

        double finalAmount = principleAmount * Math.pow((1 + interestRate/100) , timePeriod);

        double compoundInterest = finalAmount-principleAmount;

        System.out.println("Final amount including interest : " + finalAmount);

        System.out.println("Total Compound interest on the principle amount : " + compoundInterest);
    }
}
