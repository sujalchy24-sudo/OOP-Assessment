import java.util.Scanner;
public class qno9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal:");
		double pri =sc.nextDouble();
		System.out.print("Enter rate:");
		double r =sc.nextDouble();
		System.out.print("Enter time:");
		double t =sc.nextDouble();
		
		double intr = (pri *r *t)/100;
		System.out.println("Simple Intrest:" +intr);
		

	}

}
