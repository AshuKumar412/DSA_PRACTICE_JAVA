package com.Assignments;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String word = sc.nextLine();

        for(int i = word.length()-1 /* Start from last index */; i>=0 /* Continue loop until loop reaches 0 */; i-- /* decrease index by 1 */){
            System.out.print(word.charAt(i));
        }
    }
}
