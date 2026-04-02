package Week4;

public class qno1 {
	public static void main(String[] args) {
		Animal animal = new Animal(" Dogs", 9);
        animal.Forprint();

        
        Dog dog = new Dog("rocky", 4, "husky");
        dog.Forprint();

	}
}

class Animal {
	String name;
	int age;
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void Forprint(){
		System.out.println("Name: "+name +" Age: "+age);
	}
	public String getName(){
		return name;
		
	}
	
}

class Dog extends Animal{
	String breed;
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	@Override
	public void Forprint(){
		System.out.println("Name: "+name +" Age: "+age+ " Breed: "+breed);
	}
}