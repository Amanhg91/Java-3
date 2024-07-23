package problem_1;
import java.util.Scanner;


class dbpin {
	static int pin = 1234;
}

 class atm{
	 static int min_bal=500;
	 public static void deposit() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the amount to be deposited");
		 int amount = sc.nextInt();
		 min_bal+=amount;
		 atm.balance();
	 }
	 public static void withdrawl() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the withdrawl amount");
		 int amount = sc.nextInt();
		 int total = min_bal - amount;
		 if(total<=500) {
			 System.out.println("You have insufficient amount..");
		 }
		 else {
			 min_bal = total;
			 System.out.println("Your Amount"+ amount+"has been succesfully withdrawn");
		 }
		 atm.balance();
		 
	 }
	 public static void balance() {
		 System.out.print("The balance amount is:");
		 System.out.print(min_bal);
		 
	 
 }


public class Login_system_atm_project {
	public static void validation() {
		 Scanner sc = new Scanner (System.in);
		 int counter = 1;
		 while(counter <= 3) {
			 counter++;
			 System.out.println("Enter your Pin");
			 int pin = sc.nextInt();
			 if(dbpin.pin == pin && counter<=3) {
				 char ch = 'y';
				 while(ch != 'n') {
					 System.out.println("Welcome to SBI atm..");
					 System.out.println("please enter the option \n 1.Deposit \n 2.Withdraw \n 3.Balance");
					 int option = sc.nextInt();
					 int conti = 'y';
					 while(conti != 'n') {
						 switch(option) {
						 case 1:deposit();break;
						 case 2:withdrawl();break;
						 case 3:balance();break;
						default:System.out.println("Please enter the valid option");
						 }
						 System.out.println("Do you want to continue with [y/n]");
						 conti = sc.next().charAt(0);
						 if(conti  == 'n') {
							 break;
						 }
					 }
					 System.out.println("Do you want continue with [y/n]");
					 ch = sc.next().charAt(0);
					 if(ch == 'n') {
						 System.out.println("Thank You..!");
						 break;
					 }
					 
				 }
				 break;
				 
			 }
			 else if(dbpin.pin != pin && counter<=3) {
				 System.out.println("Try Again u have only "+(4-counter)+" left to pin enter..");
				 continue;
			 }
			 else if(counter > 3) {
				 System.out.println("You have tried 3 times..!");
				 System.out.println("Your Card is blocked!!");
				 break;
			 }
		 }
	     
		 
		 
	 }

	
	}
	public static void main(String[] args) {
		Login_system_atm_project.validation();
	}

}
