package com.klu;
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        int c = sc.nextInt();
        if(a>b && b>c){
            System.out.println("The Largest Number is : " +a);
        }else if(b>c && b>a){
            System.out.println("The Largest Number is : " +b);
        }else{
            System.out.println("The Largest Number is : " +c);
        }
    }
}
