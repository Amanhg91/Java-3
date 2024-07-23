package problem_1;

import java.util.Scanner;

public class Que_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
System.out.println("Factor of a number");
for(int i=1;i<=num;i++) {
	if (num%i==0) {
		System.out.println(i+" ");
	}
}
	}

}
