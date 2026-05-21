package com.Assignments;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of Subjects : ");
        int numSub = sc.nextInt();

         float sum =0;
        for(int i =0; i<numSub; i++){
            System.out.println("Enter marks for subject "+ (i+1) + ":");
            float marks = sc.nextFloat();
            sum = sum + marks;
        }
        float averageMarks = sum/numSub;
        System.out.println("Average marks is : " + averageMarks);
    }
}
