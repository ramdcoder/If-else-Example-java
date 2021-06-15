package com.blogging.java;

import java.util.Scanner;

public class IfElseExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int age = sc.nextInt();
		if(age>0 && age<13) {
			System.out.println("Children");
		}
		else if(age>=13 && age<20) {
			System.out.println("Teenage");
		}
		else if(age>=20 && age<66) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior citizen");
		}

	}

}
