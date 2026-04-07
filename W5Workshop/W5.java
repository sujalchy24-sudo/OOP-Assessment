package W5Workshop;

public class W5 {
	static abstract class Shape {
        abstract void calculateArea();
        abstract void calculatePerimeter();
    }
    static class Quadrilateral extends Shape {
        @Override
        void calculateArea() {
            System.out.println("Calculating Area of Quadrilateral");
        }
        @Override
        void calculatePerimeter() {
            System.out.println("Calculating Perimeter of Quadrilateral");
        }
    }
    public static void main(String[] args) {
        Quadrilateral quad = new Quadrilateral();
        quad.calculateArea();
        quad.calculatePerimeter();
    }
}
