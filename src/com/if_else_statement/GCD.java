package com.if_else_statement;

public class GCD {
public static int findGCD(int a, int b) {
	while(a>0 && b>0 && a!=b) {
		if(a>b) {
			a=a-b;
		}else {
			b=b-a;
		}
	}
	return b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findGCD(28,18));
	}

}
