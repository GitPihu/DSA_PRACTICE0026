package com.coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDemo {
	public static void main(String args[]) {
		
		List<Employee> lst=new ArrayList<Employee>();
		
		//Employee res=lst.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();
		
		List<Integer> random=new ArrayList<Integer>();
		random.add(43);
		random.add(56);
		random.add(98);
		random.add(56);
		random.add(65);
		random.add(55);
		List<Integer> even= random.stream().filter(f->f%2==0).collect(Collectors.toList());
		List<Integer> odd= random.stream().filter(f->f%2!=0).collect(Collectors.toList());
		
		List<Integer> res1=	Stream.concat(even.stream(), odd.stream()).collect(Collectors.toList());
		System.out.print(res1);
		
	}

}
class Employee{
	
	int id;
	String name;
	double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}