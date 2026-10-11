package com.Assignments;

import java.util.Scanner;

public class ComissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter commission (Total amount earned) : ");
        float commission = sc.nextFloat();
        System.out.println("Enter Total sales (in amount) : ");
        float sales = sc.nextFloat();

        float totalCommissionPercentage = (commission/sales)*100;

        System.out.println("Total Commission percentage is : " +totalCommissionPercentage);
    }
}
