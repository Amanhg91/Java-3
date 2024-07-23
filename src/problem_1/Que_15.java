package problem_1;

import java.util.Scanner;

public class Que_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first Number");
		int num1 =sc.nextInt();
		System.out.println("Enter the second Number");
		int num2 = sc.nextInt();
		
		for(int i=num1;i<=num2;i++) {
			int check=i;
			int sum=0;
			while(check!=0) {
				int r=check%10;
				sum=sum+(r*r*r);
				check=check/10;
				
			}
			if(sum==i) {
				System.out.println(i+ "Its a armstrong number");
			
			}
			}
		

	}

}
