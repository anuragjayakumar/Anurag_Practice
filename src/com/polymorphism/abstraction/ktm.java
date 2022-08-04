package com.polymorphism.abstraction;

public class ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("2 lakhs");
		
	}

	@Override
	public void speed() {
		System.out.println("top speed : 170km per hr");
		
		
	}
	public static void main(String[] args) {
		ktm info = new ktm ();
		info.cost();
		info.speed();
		
		
	}

}
