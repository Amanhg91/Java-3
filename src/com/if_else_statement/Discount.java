package com.if_else_statement;

import java.util.Scanner;

public class Discount {
public static int  getCost(int quantity) {
	int totalCost= quantity*100;
	if(totalCost>=1000) {
		totalCost=(int)(totalCost-(totalCost*0.1));
		return totalCost;
	
		
	}
	return totalCost;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter the quantity:");
int quantity = sc.nextInt();
int cost=getCost(quantity);
System.out.println("Cost to user:"+ cost);
	}

}
