import java.util.Scanner;
public class qno15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your first digit:");
		double x=sc.nextDouble();
		System.out.print("Enter your Second digit:");
		double y=sc.nextDouble();
		
		
		System.out.println("Sum: " + (x + y));
        System.out.println("Difference: " + (x - y));
        System.out.println("Product: " + (x * y));
        System.out.println("Quotient: " + ((double)x / y));
	}

}
