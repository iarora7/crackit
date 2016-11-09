package main.java.linkedList;

import java.util.LinkedList;

public class AnimalQueue {
	
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0;
	
	public static void main(String args[]){
		AnimalQueue animals = new AnimalQueue();
		animals.enqueue(new Cat("Callie"));
		animals.enqueue(new Cat("Kiki"));
		animals.enqueue(new Dog("Fido"));
		animals.enqueue(new Dog("Dora"));
		animals.enqueue(new Cat("Kari"));
		animals.enqueue(new Dog("Dexter"));
		animals.enqueue(new Dog("Dobo"));
		animals.enqueue(new Cat("Copa"));
		
		System.out.println(animals.dequeueAny().getName());	
		System.out.println(animals.dequeueAny().getName());	
		System.out.println(animals.dequeueAny().getName());	
	}
	
	public void enqueue(Animal a) {
		a.setOrder(order);
		order++;
		
		if(a instanceof Dog){
			dogs.addLast((Dog) a);
		} else if(a instanceof Cat) {
			cats.addLast((Cat) a);
		}
	}
	
	public Animal dequeueAny() {
		if(dogs.isEmpty()) {
			return dequeueCats();
		} else if(cats.isEmpty()) {
			return dequeueDogs();
		}
		
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		
		if(dog.isOlder(cat)) {
			return dogs.poll();
		} else {
			return cats.poll();
		}
	}

	private Animal dequeueCats() {
		return cats.poll();
	}

	private Animal dequeueDogs() {
		return dogs.poll();
	}
}

abstract class Animal {
	private String name;
	private int order;
	
	public Animal(String name) {
		this.setName(name);
	}
	
	public boolean isOlder(Animal a) {
		return (this.getOrder() < a.getOrder());
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	public Dog(String name){
		super(name);
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
}
