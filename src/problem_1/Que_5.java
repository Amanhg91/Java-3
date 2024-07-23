package problem_1;

import java.util.Scanner;

public class Que_5 {
public static int  sumOfInterval(int a, int b) {
	int sum=0;
	for(int i=a;i<=b;i++) {
		sum= sum+i;
	}
	return sum;
	
}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Lower Number");
	int a = sc.nextInt();
	System.out.println("Enter a Upper Number");
	int b= sc.nextInt();
	System.out.println(sumOfInterval(a, b));
	

	}

}
