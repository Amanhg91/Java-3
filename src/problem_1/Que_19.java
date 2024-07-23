package problem_1;

import java.util.Scanner;

public class Que_19 {
public static int pow(int n, int a) {
	if(a==0) {
		return 1;
	}
	return pow(n,a-1)*n;
}
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Base Number");
	 int num = sc.nextInt();
	 System.out.println("Enter the power number");
	 int a = sc.nextInt();
	 System.out.println("The power of number is"+pow(num, a));
	 }

}
