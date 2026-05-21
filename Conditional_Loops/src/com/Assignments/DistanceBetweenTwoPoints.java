package com.Assignments;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first point x1 : " );
        int x1 = sc.nextInt();
        System.out.println("Enter the first point x2 : " );
        int x2 = sc.nextInt();
        System.out.println("Enter the first point y1 : " );
        int y1 = sc.nextInt();
        System.out.println("Enter the first point y2 : " );
        int y2 = sc.nextInt();

        double distanceBetweenTwoPoints = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));

        System.out.println("Distance between two points are : " + distanceBetweenTwoPoints);
    }
}
