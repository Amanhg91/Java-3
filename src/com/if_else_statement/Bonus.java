package com.if_else_statement;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Salary");
double salary= sc.nextDouble();
System.out.println("Enter the year of service");
int yearsOfService=sc.nextInt();
sc.close();
  if (yearsOfService>5) {
	  double bonusAmount=0.05* salary;
	  System.out.println("Net Bonus Amount:"+bonusAmount);
  }else {
	  System.out.println("No Bonus");
  }
	}

}
