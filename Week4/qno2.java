package Week4;

public class qno2 {
	public static void main(String[] args) {
		Circle circle = new Circle(2);
	}
}

class shape{
		public double getPerimeter() {
			return 0;
		}
		
		public double getArea() {
			return 0;
		}
}

class Circle extends shape{
	double radius;
	double perimeter;
	double area;
	
	@Override
	public double getPerimeter() {
		perimeter = 2*Math.PI * radius;
		return perimeter;
	}
	
	@Override
	public double getArea() {
		area = Math.PI * (radius*radius);
		return area;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.area = getArea();
		this.perimeter = getPerimeter();
		System.out.println("Perimeter: "+ perimeter);
		System.out.println("Area: "+ area);
	}
}
