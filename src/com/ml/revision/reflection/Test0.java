package com.ml.revision.reflection;

import java.lang.reflect.AccessFlag;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashSet;

class Animal {
	private int id;
	private String name;
	private Color color;
	private Eye eyes;
	private Hand hands;
	private Leg legs;

	public Animal() {
		System.out.println("Default constructor in Animal class");
	}

	static {
		System.out.println("Static Block Inside Animal Class");
	}
	
	public void makeSound() {
		System.out.println("Animal makes sound");
	}
	
	public void walk() {
		System.out.println("");
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
		return "Animal [id=" + id + ", name=" + name + ", color=" + color.value + ", eyes=" + eyes.value + ", hands=" + hands.value
				+ ", legs=" + legs.value + "]";
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
			Animal animal = (Animal)cl.newInstance();
			animal.setId(0);
			animal.setName("Dog");
			animal.setColor(Color.GREY);
			animal.setEyes(Eye.TWO);
			animal.setLegs(Leg.FOUR);
			animal.setHands(Hand.NONE);
			System.out.println(animal);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SecurityException e) {
			e.printStackTrace();
		}
	}

}
