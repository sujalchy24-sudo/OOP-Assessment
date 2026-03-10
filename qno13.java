import java.util.Scanner;
public class qno13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the quantity:");
		int q =sc.nextInt();
		System.out.print("Enter the Price:");
		double p =sc.nextDouble();
		
		double pur =p*q;
		System.out.print("Total cost price:"+pur);
	}
}
