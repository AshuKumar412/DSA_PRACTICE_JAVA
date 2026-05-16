package com.klu;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int num = sc.nextInt();
        System.out.println("Enter the key to check : ");
        int key = sc.nextInt();
        int count = 0;
        while(num>0){
           int  r = num % 10;
            if(r==key){
                count++;
            }
            num = num/10;
        }
        System.out.println("Total freq of the key is : " + count);
    }
}
