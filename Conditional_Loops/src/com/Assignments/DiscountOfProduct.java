package com.Assignments;

import java.util.Scanner;

public class DiscountOfProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of products : ");

        int num = sc.nextInt();

        double totalPriceWithoutDiscount = 0;
        double totalPriceWithDiscount = 0;

        for(int i = 0; i < num; i++){

            System.out.print("Enter price of product " + (i + 1) + " : ");

            double productPrice = sc.nextDouble();

            System.out.print("Enter discount for product " +
                    (i + 1) + " (in %) : ");

            double discountPercentage = sc.nextDouble();

            // Adding original product price
            totalPriceWithoutDiscount += productPrice;

            // Calculating discount amount
            double discountAmount =
                    (discountPercentage * productPrice) / 100;

            // Final price after discount
            double finalPrice =
                    productPrice - discountAmount;

            // Adding discounted product price
            totalPriceWithDiscount += finalPrice;
        }

        System.out.println("\nTotal number of products : " + num);

        System.out.println("Total price without discount : "
                + totalPriceWithoutDiscount);

        System.out.println("Total price with discount : "
                + totalPriceWithDiscount);
    }
}