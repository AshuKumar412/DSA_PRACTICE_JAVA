package com.Assignments;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int orininalNumber = num;
        int reverseNumber = 0;
        while(num>0){
           int res = num % 10;
           reverseNumber = (reverseNumber*10)+res;
           num = num/10;
        }
        if(orininalNumber == reverseNumber){
            System.out.println(orininalNumber + " is palindrome Number");
        }else{
            System.out.println(orininalNumber + " is not palindrome Number");
        }
    }
}
