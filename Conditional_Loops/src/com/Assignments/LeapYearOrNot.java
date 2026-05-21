package com.Assignments;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        int count =0;
        int originalYear = year;
        while(year>0){
            int digit = year%10;
            count++;
            year = year/10;
        }
        year = originalYear;
        if(count != 4){
            System.out.println("Year is not valid ");
        }else if(year%4 == 0){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is not leap year");
        }
    }
}
