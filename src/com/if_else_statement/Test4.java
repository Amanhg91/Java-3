package com.if_else_statement;

public class Test4 {
public static void isPositiveEven(int num) {
	if (num>0) {
		if(num%2==0) {
			System.out.println("Positive even number");
		}else {
			System.out.println("Positive odd number");
		}
	}else {
		System.out.println("negative number");
	}
}
	public static void main(String[] args) {
		isPositiveEven(-24);

	}

}
