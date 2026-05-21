package com.Assignments;

import java.util.Scanner;

public class ElctricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Formula : Total Bill=(Units×Rate)+Fixed Charge+Tax

        System.out.println("Enter total units consumed : ");
        double units = sc.nextDouble();
        System.out.println("Enter rate of the units : ");
        double rate = sc.nextDouble();
        System.out.println("Enter fixed charge : ");    // This fare is applicable to all consumers as it is maintenance charge for meter or transformers
        double fixedCharge = sc.nextDouble();
        System.out.println("Enter tax amount : ");
        double tax = sc.nextDouble();

        double ElectricityBill = (units*rate)+fixedCharge+tax;

        System.out.println("Total Electricity Bill is : " + ElectricityBill);
    }
}
