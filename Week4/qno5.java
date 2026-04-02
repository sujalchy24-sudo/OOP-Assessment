package Week4;

public class qno5 {
    public static void main(String[] args) {
        Child obj = new Child("private", "publicB", "publicC");
        obj.display();
    }
}

class Parent {
    private String a;
    public String b;
    public String c;

    // Constructor
    public Parent(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter for private variable
    public String getA() {
        return a;
    }
}

class Child extends Parent {
    public Child(String a, String b, String c) {
        super(a, b, c); 
    }

    public void display() {
        // System.out.println(a);  Not accessible
        System.out.println("Private a (via getter): " + getA());
        System.out.println("Public b: " + b);
        System.out.println("Public c: " + c);
    }
}