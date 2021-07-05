package oops.object.ploymorphism;


	abstract class Animal{    // if we define the below 3 classes as public , it should  be in another files of its own.
		abstract void bark();
	}
	
	 class Dog extends Animal{
		public void bark() {
			System.out.println("Bow Bow");
		}
	}
	
	class Cat extends Animal{
		public void bark() {
			System.out.println("Meow Meow");
		}
	}
	
	public class AnimalRunner {
	public static void main(String[] args) {
		Animal[] animals= {new Dog(),new Cat()};
		for(Animal animal:animals) {
			animal.bark();   // same method but behaves differently based on the diff implementations.
		}
	}
}
