package Week4;

public class qno6 {
    public static void main(String[] args) {
        subClass obj = new subClass();
        obj.name = "John";
        obj.lastname = "Doe";
        obj.namelast();
    }
}

class finalClass {
    String name;
    String lastname;

    public void namelast() {
        System.out.println(name);
        System.out.println(lastname);
    }
}

class subClass extends finalClass {
    
    public void namelast() {
        int a = 5;
        int b = 10;
        int sum = a + b;

        System.out.println("Sum: " + sum);
    }
}