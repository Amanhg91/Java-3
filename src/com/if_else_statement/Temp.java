package com.if_else_statement;

public class Temp {
public static void temp(int t) {
	if(t<20) {
		System.out.println("Cold");
	}else if(t>20 && t<30) {
		System.out.println("Warm");
	}else {
		System.out.println("Hot");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
temp(2);
	}

}
