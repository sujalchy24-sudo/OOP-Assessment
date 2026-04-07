package W5Workshop;

public class Interface {
	interface Animal {
        void eat();
        void walk();
    }
    interface Printable {
        void display();
    } 
    static class Cow implements Animal, Printable {
        @Override
        public void eat() {
            System.out.println("Cow eats grass");
        }
        @Override
        public void walk() {
            System.out.println("Cow walks on four legs");
        }
        @Override
        public void display() {
            System.out.println("Displaying Cow information");
        }
    }
    public static void main(String[] args) {
        Cow myCow = new Cow();
        myCow.eat();
        myCow.display();
    }
}
