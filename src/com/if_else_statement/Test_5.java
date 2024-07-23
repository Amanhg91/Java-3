package com.if_else_statement;

public class Test_5 {
public static int totalAmount(int x ,int y) {
	int money=0;
	for(int i=0; i<=y; i++) {
		if(i>x) {
			money++;
		}
		money++;
	}
	return money;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Test_5.totalAmount(74, 48));
	}

}
