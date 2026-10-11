package com.Assignments;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total runs made by batsman : ");
        int runs = sc.nextInt();
        System.out.println("Enter how many times player got out : ");
        int out = sc.nextInt();

        int battingAverage = runs/out;

        System.out.println("Batting Average of a BatsMan is :  " +battingAverage);
    }
}
