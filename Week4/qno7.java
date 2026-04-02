package Week4;

public class qno7 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int twoint = cal.twoInteger(2,3);
		int threeint = cal.threeInteger(2, 3, 1);
		
		double twodoubles = cal.twodoubles(2.9, 3.9);
		double threedoubles = cal.threedoubles(1.2,2.1,6.8);
		
		cal.Forprint(twoint, threeint, twodoubles, threedoubles);
	}
}

class Calculator{
	int a;
	int b;
	int c;
	double x;
	double y;
	double z;
	
	public int twoInteger(int a, int b) {
		this.a = a;
		this.b = b;
		
		return a+b;
	}
	
	public int threeInteger(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		return a+b+c;
	}
	
	public double twodoubles(double x, double y) {
		this.x = x;
		this.y = y;
		return x+y;
	}
	
	public double threedoubles(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		return x+y+z;
	}
	
	public void Forprint(int sum1, int sum2, double sum3, double sum4) {
		System.out.println("Two Integers: "+ sum1);
		System.out.println("Three Integers: "+ sum2);
		System.out.println("Two Double: "+ sum3);
		System.out.println("Three Double: "+ sum4);
	}
}