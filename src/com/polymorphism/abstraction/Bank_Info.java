package com.polymorphism.abstraction;
//QUESTION 6
    // Project   :BankDetails
    // Package   :org.bank
     //Class     :BankInfo
     //Methods   :saving(),fixed(),deposit()

     //Class     :AxisBank
     //Methods   :deposit()

//Description:
//You have to override the method deposit in AxisBank.

public class Bank_Info {
	public void saving() {
		System.out.println("savings acc :1,20,000");
}
	public void fixed() {
		System.out.println("fixed amount : 50,00,000");
		
	}
	public void deposit() {
		System.out.println("deposit amount: 30,000");
		
	}
}
