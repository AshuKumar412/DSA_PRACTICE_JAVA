package com.Assignments;

import java.util.Scanner;

public class DepreciationOfAsset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Original value of amounr : ");
        float originalValue = sc.nextFloat();
        System.out.println("Enter the rate : ");
        float rate = sc.nextFloat();

        /*

        Depreciation means decrease in value of an asset over time.

        Basic depreciation formula:

        Depreciated Value=Original Value−Depreciation Amount

        Depreciation amount formula:

        Depreciation Amount=  (Depreciation Rate×Original Value)/100

        Combined formula:   Final Value=Original Value−(Rate×Original Value)/100

         */

        float depreciationAmount = (rate*originalValue)/100;
        float finalValue = originalValue-(rate*originalValue)/100;

        System.out.println("Depreciation Amount : " + depreciationAmount);
        System.out.println("Final Amount : " + finalValue);

    }
}
