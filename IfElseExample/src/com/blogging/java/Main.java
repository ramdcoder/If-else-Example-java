package com.blogging.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);/*I have already discussed about Scanner class here. 
		                                       You can visit it to understand Scanner clearly.
                                               This is the link please copy it and paste it in your browser to view more about Scanner 
                                               https://easyjavatechprogramming.blogspot.com/2021/06/packages-scanner-classtaking-input-from.html */
         
		 boolean ID = sc.nextBoolean();//nextBoolean() is a method to take input from user for boolean types. It should be either true/false.

		 int fee = sc.nextInt();

		 if(ID==true && fee==5){ /*If driver provides Id it will be set to true and if he provides the right amount of fee, the amount he provided will 
                                   be entered and checked if the conditions are satisfied is so then the block inside the if will be executed else the code
                                   within the else part will be executed*/
 
		    System.out.println("You can pass through the gate");

		 }

		 else{

			 System.out.println("Oops!!You have failed to provide your ID or fee or both. You cannot pass any further");

		 }

	}

}
