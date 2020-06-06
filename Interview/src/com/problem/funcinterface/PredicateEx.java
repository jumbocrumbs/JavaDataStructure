package com.problem.funcinterface;

import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {
		Employee e1= new Employee("Ravi", 2000);
		Predicate<Employee> p= emp -> emp.getSalary() > 3000;
		if(p.test(e1)) {
			System.out.println("Nice Salary");
		}
	}

}
