package com.if_else_statement;

public class Test3 {
public static void gradeSystem(int marks) {
	if(marks>=80) {
		System.out.println("Distinction");
}else if(marks>=60 && marks<80) {
		System.out.println(" 1st Division");
	}else if(marks>=40 && marks<60){
		System.out.println("2nd Division");
	}
	else {
	System.out.println("Try again");
}
}
	public static void main(String[] args) {

gradeSystem(45);
	}

}
