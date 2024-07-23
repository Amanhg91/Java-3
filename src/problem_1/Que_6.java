package problem_1;

import java.util.Scanner;

public class Que_6 {
public static void getGreatestOfThree(int a, int b, int c) {
	if(a==b && a==c) {
		System.out.println(a);
	}
	if(a>b && a>c) {
		System.out.println("a is greater");
	}else if(b>c) {
		System.out.println("b is greater");
	}else {
		System.out.println("c is Greater");
	}
}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a as Number");
	int a = sc.nextInt();
	System.out.println("Enter b as Number");
	int b = sc.nextInt();
	System.out.println("Enter c as Number");
	int c = sc.nextInt();
	getGreatestOfThree(a, b, c);

	}

}
