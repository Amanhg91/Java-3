package problem_1;

import java.util.Scanner;

public class Que_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Program to find the nth Number of fibonacci");
System.out.println("Enter the nth Term");
int n= sc.nextInt();
int a=0;
int b=1;

for(int i = 0;i<=n-2;i++) {
	int c=a+b;
	a=b;
	b=c;
}
System.out.println(b);
	}

}
