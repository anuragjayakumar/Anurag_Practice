package com.polymorphism.abstraction;
//QUESTION 2:
//------------
//Project   :EmployeeDetails
// Package   :org.emp
//Class     :Employee 
//Methods   :empId()

//Description
//You have to overload the method empId() based on different datatype in arguments.

public class Employee {
	public void emp_Id(int employee_id_number) {
		System.out.println("employee id number"+employee_id_number);

	}
	public void emp_Id(String employee_name) {
		System.out.println("employee full name "+employee_name);
	}
	public void emp_Id(char employee_initial,String last_name) {
		System.out.println("employee last name with initial"+last_name+employee_initial);
	}
	public static void main(String[] args) {
		Employee details = new Employee();
		details.emp_Id(453637);
		details.emp_Id("Anurag");
		details.emp_Id('j', " jayakumar  ");
		
	}

	}

