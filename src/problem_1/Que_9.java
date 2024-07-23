package problem_1;

import java.util.Scanner;

public class Que_9 {
public static void primeNumber(int a, int b) {
	boolean prime;
	System.out.println("Prime numbers are ");
	for(int i=a;i<=b;i++) {
		if(i==0 || i==1 ) {
			continue ;
			
		}
		prime=true;
		for(int j=2; j<=i/2;j++) {
			if(i%j==0) {
				prime=false;
				break;
			}
		}
		if(prime==true) {
			System.out.println(i+ " ");
		}
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Lower Number");
		int lower1= sc.nextInt();
		System.out.println("Enter a Upper Number");
		int upper1= sc.nextInt();
		primeNumber(lower1, upper1);
	}

}
