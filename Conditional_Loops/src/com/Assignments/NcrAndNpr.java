package com.Assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NcrAndNpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while(true){
           System.out.print(" 1. Calculate Combination \n 2. Calculate Permutation \n 3. Exit \n Enter your Choice : \n");
           int ch = sc.nextInt();
           if(ch==1){
               System.out.println("Enter number of choice : ");
               int choice = sc.nextInt();
               System.out.println("Enter number of selected items : ");
               int selection = sc.nextInt();
               int result = 1;
               for(int i = 0; i<selection; i++){
                   result = result*(choice-i);      // calculate numerator
                   result = result/(i+1);           // calculate denominator
               }
               System.out.println("The result of nCr is : " + result);
           } else if (ch == 2) {
               System.out.println("Enter total nunber of objects : ");
               int objects = sc.nextInt();
               System.out.println("Enter total number of selected objects : ");
               int selectedObjects = sc.nextInt();
               int result = 1;
               for(int i =0; i<selectedObjects; i++){
                   result = result*(objects-i);   // only calculate numerator no need to calculate denominator
               }
               System.out.println("The result of nPr is : " + result);
           } else if (ch==3) {
               break;
           }else {
               System.out.println("Enter valid choice !!");
           }
       }
    }
}
