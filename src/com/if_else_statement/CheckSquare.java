package com.if_else_statement;

import java.util.Scanner;

public class CheckSquare {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length of the rectangle ");
double length= sc.nextDouble();
System.out.println("Enter the breadth of the rectangle");
double breadth=sc.nextDouble();
if (length==breadth) {
	System.out.println("The rectangle is a square");
}else {
	System.out.println("The rectangle is not a square");
}
sc.close();
}

}
