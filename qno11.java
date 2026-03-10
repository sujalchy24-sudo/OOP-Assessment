import java.util.Scanner;
public class qno11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in miles:");
		double m = sc.nextDouble();
		
		double km = m *1.61;
		System.out.print("Distance in kilometer:" +km);

	}

}
