package rahul.help.towithown;

class Animal{
	private String name;
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	public void eat() {
		System.out.println(name + " is eating.");
			
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
	
	public String getName() {
		return name;
	}
}
//subclass
class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(getName() + " is barking.");
	}
}

public class InheritanceAnimal {

	public static void main(String[] args) {
		System.out.println("output of super class");
		Animal animal = new Animal("Hardi");
		animal.eat();
		animal.sleep();
		
		System.out.println();
		System.out.println("output from sub class ");
		Dog dog = new Dog("Sheru");
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		

	}

}
