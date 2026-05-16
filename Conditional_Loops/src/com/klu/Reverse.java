package com.klu;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int ans = 0;
        while(num>0){
            int r = num%10;
            num = num/10;
            ans = ans*10+r;
        }
        System.out.println("Reverse of the number is : "+ ans);
    }
}
