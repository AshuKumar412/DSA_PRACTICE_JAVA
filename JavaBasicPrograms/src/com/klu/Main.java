package com.klu;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt(); 
		if(num==2)
			System.out.println("Prime");
		int c=2;
		while(c<num) {
			if(num%c==0) {
				System.out.println("Not Prime"); 
				break;
			}else {
				c=c+1;
			}
			System.out.println("Prime");
			
		}
		
	}
}
