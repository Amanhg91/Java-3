package problem_1;

import java.util.Scanner;

public class Que_7 {

		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enetr a Year number");
			int year=sc.nextInt();
			if(year%4==0) {
				if(year%100==0) {
					if(year%400==0) {
						System.out.println("Its a leap Year");
					}
				}
				else {
					System.out.println("Its a leap Year");
				}
			}
			else {
				System.out.println("Its not a leap year");
			}
			

			}
	}


