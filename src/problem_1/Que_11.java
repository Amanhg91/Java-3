package problem_1;

import java.util.Scanner;

public class Que_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		long fact = 1;
		for(int i=1;i<=n;i++) {
			fact= fact*i;
		}
		System.out.println("Factorial is "+fact);
		
		
	}

}
