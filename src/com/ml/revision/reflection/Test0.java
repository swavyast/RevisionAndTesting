package com.ml.revision.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Animal {
	private int id;
	private String name;
	private Color color;
	private Eye eyes;
	private Hand hands;
	private Leg legs;

	private Animal() {
		System.out.println("Default constructor in Animal class");
	}

	static {
		System.out.println("Static Block Inside Animal Class");
	}

	public void makeSound() {
		System.out.println("Animal makes sound");
	}

	public void walk() {
		System.out.println("walking...");
	}

	public String getAll() {

		return "[ className : "+this.getClass() + "\n instance Id : " + this.getId() + "\n Animal Name :" + this.getName() + "\n" + this.getColor() + "\n"
				+ this.getEyes() + "\n" + this.getHands() + "\n" + this.getLegs()+"]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Eye getEyes() {
		return eyes;
	}

	public void setEyes(Eye eyes) {
		this.eyes = eyes;
	}

	public Hand getHands() {
		return hands;
	}

	public void setHands(Hand hands) {
		this.hands = hands;
	}

	public Leg getLegs() {
		return legs;
	}

	public void setLegs(Leg legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", color=" + color.value + ", eyes=" + eyes.value + ", hands="
				+ hands.value + ", legs=" + legs.value + "]";
	}

}

enum Color {
	RED("Red"), GREEN("Green"), YELLOW("Yellow"), WHITE("White"), GREY("Grey"), DARK("Dark"), BLUE("Blue");

	String value;

	Color(String v) {
		this.value = v;
	}
}

enum Leg {
	TWO("Two"), FOUR("Four");

	String value;

	Leg(String v) {
		this.value = v;
	}
}

enum Eye {
	TWO("Two"), FOUR("Four");

	String value;

	Eye(String v) {
		this.value = v;
	}
}

enum Hand {
	TWO("Two"), NONE("");

	String value;

	Hand(String v) {
		this.value = v;
	}
}

public class Test0 {

	public static void main(String[] args) throws NoSuchMethodException {
		try {
			Class<?> cl = Class.forName("com.ml.revision.reflection.Animal");
			/**
			 * This block of code can be used to access the constructor of animal class
			 * using reflection when access modifier for Animal class constructor is public.
			 * 
			 * Animal animal = (Animal)cl.newInstance(); animal.setId(0);
			 * animal.setName("Dog"); animal.setColor(Color.GREY); animal.setEyes(Eye.TWO);
			 * animal.setLegs(Leg.FOUR); animal.setHands(Hand.NONE);
			 * System.out.println(animal);
			 */
			// even when the constructor is defined as private, it can be accessed using
			// reflection as mentioned below.
			Constructor<?> c = cl.getDeclaredConstructor(); // Class gets loaded here.
			c.setAccessible(true); // access specifier of the constructor gets changed from private to public.
			Animal animal1 = (Animal) c.newInstance(); // new instance is created using already modified constructor.
			/**
			 * setting instance members using corresponding setter methods.
			 */
			animal1.setId(1);
			animal1.setName("Cat");
			animal1.setColor(Color.WHITE);
			animal1.setEyes(Eye.TWO);
			animal1.setLegs(Leg.FOUR);
			animal1.setHands(Hand.NONE);
			System.out.println(animal1); // calling overridden toString method by means of print stream.
			animal1.makeSound(); // prints 'Animal makes sound'.
			animal1.walk(); // prints 'walking...'.
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SecurityException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
