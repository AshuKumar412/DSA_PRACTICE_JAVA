package com.Assignments;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().trim().charAt(0);
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch =='o' || ch=='O'){
            System.out.println(ch + " is Vowel");
        }else{
            System.out.println(ch + " is Consonant");
        }
    }
}
