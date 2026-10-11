package com.klu;
import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        int salary = sc.nextInt();
        if(salary>=10000){
            System.out.println("Updated Salary : " + (salary+2000));
        }else{
            System.out.println("Updated Salary : " + (salary+1000));
        }
    }
}
