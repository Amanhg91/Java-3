package problem_1;

import java.util.Scanner;

public class Que_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int sum=0;
for(int i=1;i<num;i++) {
	sum= sum+i;
}
	
	if(num<sum) {
		System.out.println("The number is a Abundant Number");
	}
	else {
		System.out.println("The number is not a Abundant Number");
	}

}
}
