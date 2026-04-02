package Week4;

import java.util.Scanner;
public class qn1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		String number = "";
		String DOB = "";
		String password = "";
		
		while (true) {
			System.out.println("Please enter 1 for Sign up.");
			System.out.println("Please enter 2 to Quit.");
			int choice = scanner.nextInt();
			
			if (choice == 1) {
				scanner.nextLine();
				
				while (true) {
					System.out.println("Please enter your full name: ");
					name = scanner.nextLine();
					int len = name.length();
					
					if (len<4) {
						System.out.println("The Length must be greater than 4");
						continue;
					}
					break;
				}
				
				while (true) {
					System.out.println("Please enter your phone number: ");
					number = scanner.nextLine();
					
					int len2 = number.length();
					
					if (len2!=10) {
						System.out.println("The total digit should be 10.");
						continue;
					}
					break;
				}
				while(true) {
					System.out.println("Please enter your date of  (DD//MM//YY): ");
					DOB = scanner.nextLine();
					
					int len3 = DOB.length();
				if (len3!= 10) {
					System.out.println("DOB must be in format DD//MM//YY.");
					continue;
				}
				break;
				}
				System.out.println("Please enter your password: ");
				password = scanner.nextLine();
				
				userSignup user  = new userSignup(name, number, DOB, password);
			}
			if (choice == 2) {
				System.out.println("Thank you for using this application.");
				break;
			}
		
		}
	}
}

class userSignup{
	String name;
	String number;
	String DOB;
	String password;
	
	public userSignup(String name, String number, String DOB, String password) {
	this.name = name;
	this.number = number;
	this.DOB = DOB;
	this.password = password;
	
	System.out.println("User Registered.");
	}
}