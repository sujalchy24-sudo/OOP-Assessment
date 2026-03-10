import java.util.Scanner;
public class qno10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your first digit:");
		double o =sc.nextDouble();
		System.out.print("Enter your Second digit:");
		double t =sc.nextDouble();
		
		System.out.print("Addition:" +(o+t));
		System.out.print("Subtraction:" +(o-t));
		System.out.print("Multiplicaion:" +(o*t));
		System.out.print("Division:" +(o/t));
	}

}
