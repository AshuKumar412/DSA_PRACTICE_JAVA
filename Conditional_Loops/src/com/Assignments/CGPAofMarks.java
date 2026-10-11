package com.Assignments;

import java.util.Scanner;

public class CGPAofMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of subjects : ");
        int subNum = sc.nextInt();
        int totalGradePoints = 0;
        for(int i =0; i<subNum; i++){
            System.out.println("Enter Grade points for subject " + (i + 1) + ":");
            int gradePoint = sc.nextInt();
            totalGradePoints = gradePoint + totalGradePoints;
        }
        double totalCgpa = (double) totalGradePoints/subNum;
        System.out.println("Total CGPA is : " + totalCgpa);
    }
}
