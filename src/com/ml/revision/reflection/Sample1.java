package com.ml.revision.reflection;

import java.time.LocalDate;
import java.util.List;

public class Sample1 {

	private Long id;
	private String name;
	private byte age;
	private static LocalDate dob;
	private static final String TYPE = "Sample";
	
	public List<String> cards;
	public double credit;
	public double debit;
	public double balance;
	
	private void methodOne() {
		System.out.println("Sample1.methodOne()");
	}
	
	void methodTwo() {
		System.out.println("Sample1.methodTwo()");
	}
	
	public void methodThree() {
		System.out.println("Sample1.methodThree()");
	}
	
	public void customShow(String s) {
		if(s.equalsIgnoreCase("methodOne")) {
			methodOne();
		}
		if(s.equalsIgnoreCase("methodTwo")) {
			methodTwo();
		}
		if(s.equalsIgnoreCase("methodThree")) {
			methodThree();
		}
	}
	
	public Sample1() {
		System.out.println("Default Constructor : Sample1.Sample1()");
	}

	public Sample1(List<String> cards, double credit, double debit, double balance) {
		super();
		this.cards = cards;
		this.credit = credit;
		this.debit = debit;
		this.balance = balance;
	}

	private Sample1(Long id, String name, byte age, List<String> cards, double credit, double debit, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.cards = cards;
		this.credit = credit;
		this.debit = debit;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public static LocalDate getDob() {
		return dob;
	}

	public static void setDob(LocalDate dob) {
		Sample1.dob = dob;
	}

	public List<String> getCards() {
		return cards;
	}

	public void setCards(List<String> cards) {
		this.cards = cards;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static String getType() {
		return TYPE;
	}

	@Override
	public String toString() {
		return "Sample1 [id=" + id + ", name=" + name + ", age=" + age + ", cards=" + cards + ", credit=" + credit
				+ ", debit=" + debit + ", balance=" + balance + "]";
	}
	
}
