import java.util.Scanner;

public class qno6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double side = sc.nextDouble();

        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}