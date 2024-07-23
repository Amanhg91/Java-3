package com.if_else_statement;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("enter a number");
int num = sc.nextInt();
if(num %1 == 0 && num%num==0 ) {
	System.out.println(num+"is a Prime Number");
}
else {
		System.out.println("Number is not a prime number"); 
	}

}
}
