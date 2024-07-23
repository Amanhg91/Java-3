package problem_1;

import java.util.Scanner;

public class Que_14 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a Number");
	 int n= sc.nextInt();
	 int rev=0,r;
	 int m=n;
	 while(n>0) {
		 r= n%10;
		 rev=rev*10+r;
		 n=n/10;
	 }
	 if(rev==m) {
		 System.out.println("It is a palindrone");
	 }else {
		 System.out.println("Its not a palindrone");
	 }
	}

}
