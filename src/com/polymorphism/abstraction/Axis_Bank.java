package com.polymorphism.abstraction;

public class Axis_Bank extends Bank_Info {
	@Override
	public void deposit() {
		super.deposit();
	}
	public static void main(String[] args) {
		Axis_Bank det = new Axis_Bank();
		det.saving();
		det.deposit();
		det.fixed();
		
	}

}
