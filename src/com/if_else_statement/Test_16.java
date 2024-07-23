package com.if_else_statement;

import java.util.Scanner;

public class Test_16 {
	public static int chef (int x , int y , int z) {
		int total = x*5+ y*10;
		if(total>z) {
			
			int temp = total/z;
			return temp;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();

		 int y = sc.nextInt();
		 int z = sc.nextInt();
		 int v = chef(x, y, z);
		 System.out.println(v);

	}

}
