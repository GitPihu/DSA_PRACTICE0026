package com.collection.compartor.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.design.pattern.lld.SingleTonDemo;

public class Demo {

	public static void main(String args[]) {

		Employee e1 = new Employee(1, "priyanka", "silvassah", 1500);
		Employee e7 = new Employee(1, "snehal", "silvassah", 1500);
		Employee e2 = new Employee(1, "bhavna", "silvassagh", 1500);
		Employee e3 = new Employee(1, "amanda", "silvassag", 1500);
		Employee e4 = new Employee(1, "suresh", "silvassaggg", 1500);

		Map<Employee, String> obj = new HashMap<Employee, String>();

		obj.put(e1, "sil1");
		obj.put(e2, "sil2");
		obj.put(e3, "sil3");
		obj.put(e4, "sil4");
		obj.put(e7, "sil4");

		//System.out.print(obj);
		//System.out.print(obj.size());

		/**
		 * Sort list of employee by name
		 */

		List<Employee> lst = new ArrayList<Employee>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		Collections.sort(lst, new EmployeeCpmprator());
		
		System.out.print(lst);
		
		System.out.println(SingleTonDemo.getInstance().hashCode());
		
	}

}

class Employee {

	int id;
	String name;
	String add;
	double salary;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + ", salary=" + salary + "]";
	}

	public Employee(int id, String name, String add, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.salary = salary;
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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((add == null) ? 0 : add.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (add == null) {
			if (other.add != null)
				return false;
		} else if (!add.equals(other.add))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

}
