package com.if_else_statement;

import java.util.Scanner;

public class Test_15 {
public static int chef (int x , int y) {
	if(y>x) {
		int total = y-x;
		int temp = x+(total*2);
		return temp;
	}else {
		return x;
	}
}
	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int x = sc.nextInt();

 int y = sc.nextInt();
 int z = chef(x, y);
 System.out.println(z);

	}

}
