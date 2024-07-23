package problem_1;

import java.util.Scanner;

public class Que_8 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number to check Prime number");
int num= sc.nextInt();
boolean prime= true;
for(int i=2;i<=num/2;i++) {
	if(num%i==0) {
		prime=false;
	}
	break;
	
}
if(prime) {
System.out.println(num + "Number is a Prime Number");
	}else {
		System.out.println(num + "Number is not a prime number");
	}

}
}
