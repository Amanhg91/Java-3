package com.if_else_statement;

public class CheckingNumber {
	public static void checkNumber(int num) { 
		if(num%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
		public static void main(String[] args) {

	checkNumber(2);
	
}
}
