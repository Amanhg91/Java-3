package problem_1;

import java.util.Scanner;

public class Que_18 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Number");
	 int digit= sc.nextInt();
	 int num = digit;
	 int sum=0;
	 while(digit>0) {
		 int r = digit%10;
		 sum= sum+r;
		 digit= digit/10;
	 }
	 if(num%sum ==0) {
		 System.out.println("The number is a Harshad Number");
	 }
	 else {
		 System.out.println("The number is not a Harshad number");
	 }

	}

}
