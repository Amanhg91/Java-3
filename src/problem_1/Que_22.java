package problem_1;

import java.util.Scanner;

public class Que_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number");
int num= sc.nextInt();
int sum=0;
for(int i=1;i<=num/2;i++) {
	if(num%i==0) {
		sum=sum+i;
	}
}
if(num == sum) {
	System.out.println("Number is a Perfect number");
}else
{
	System.out.println("Number is not a perfect number");
}
	}

}
