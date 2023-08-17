//1.Class Inheritance and Polymorphism: You are building a system for a zoo. 
//Create a base class Animal with properties like name and age, and a method makeSound().
//Derive classes like Lion, Elephant, and Giraffe from Animal, each with their specific 
//sound implementation. Implement a Zoo class to manage a collection of animals. 
//Demonstrate polymorphism by iterating through the collection and calling the makeSound()
//method for each animal.

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		Lion l = new Lion("lion",11);
		Elephant e = new Elephant("Elephant", 12);
		Giraffe g = new Giraffe("Giraffe", 13);
		
		Zoo z = new Zoo();
		z.addAnimal(l);
		z.addAnimal(e);
		z.addAnimal(g);
		
		z.iterateAnimal();

	}
}

class Animal{
	protected String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() {
		System.out.println("Animal sounds");
	}
}

class Lion extends Animal{
	public Lion(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Lion sounds");
	}
}

class Elephant extends Animal{
	public Elephant(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Elephant sounds");
	}
}

class Giraffe extends Animal{
	public Giraffe(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Giraffe sounds");
	}
}

class Zoo{
	
	private List<Animal> animals;
	
	public Zoo() {
		this.animals = new ArrayList<>();
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void iterateAnimal() {
		for(Animal animal : animals) {
			animal.makeSound();
		}
	}
}




