package com.Assignments;

import java.util.Scanner;

public class OutingOnEvenDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month :");
        String month = sc.nextLine();
        int numberOfDays = 0;
        if(month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")){
            numberOfDays = 30;
        } else if (month.equals("February")) {
            numberOfDays=28;
        }else{
            numberOfDays=31;
        }
        int count = 0;
        for(int i = 1; i<=numberOfDays; i++){
            if(i%2 == 0){
                count++;
            }
        }
        System.out.println("Number of days he can walk outside on even days of month is : "+ count);
    }
}
