package stream.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MasterCardQues {

	public static void main(String args[]) {

		Employee e1 = new Employee(1, "Priyanka", "Dev", new BigDecimal(50000));
		Employee e2 = new Employee(2, "Bhavna", "Teaching", new BigDecimal(5000));
		Employee e3 = new Employee(87, "Suresh", "QA", new BigDecimal(50000));
		Employee e4 = new Employee(16, "Sanjana", "QA", new BigDecimal(500));
		Employee e5 = new Employee(18, "Bharati", "Art", new BigDecimal(500000));
		Employee e6 = new Employee(16, "Jigna", "Dev", new BigDecimal(50000));

		List<Employee> lst = new ArrayList<Employee>();

		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		lst.add(e5);
		lst.add(e6);

		// group by departmen

		Map<String, Long> res = lst.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

		System.out.println(res);

		// group by dept and then total salary of each employee

		Map<String, Long> res1 = lst.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.summingLong(e -> e.salary.longValue())));

		System.out.println(res1);

		// group by dept and then find max salary
		// @SuppressWarnings("unchecked")
		// Map<String, Employee> jkjh=lst.stream().collect((Supplier<R>)
		// Collectors.groupingBy(Employee::getDept),(BiConsumer<R, ? super Employee>)
		// Collectors.
		// collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
		// Optional::get));

		// find character count

		String s = "ilovejavatechie";
		Map<String, Long> resf = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(resf);

		// find first non repeated charcter

		String fnrc = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() == 1).findFirst().get().getKey();

		System.out.println(fnrc);

		// find max/min salary of empliyee
		Employee ed = lst.stream().min(Comparator.comparing(Employee::getSalary)).get();

		System.out.println(ed);

		// Sort the string

		String gg = "priyanka bhavna ravindra suresh";

		List<String> ffd = Arrays.stream(gg.split(" ")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(ffd);

		// sort the emp by id and then salary
		List<Employee> fdsf = lst.stream()
				.sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getSalary))
				.collect(Collectors.toList());

		System.out.println(fdsf);

		// find duplicate element from a list

		List<Integer> el = new ArrayList<Integer>();
		el.add(21);
		el.add(28);
		el.add(26);
		el.add(122);
		el.add(222);
		el.add(1222);

		Set<Integer> st = new HashSet<Integer>();
		Set<Integer> fhgf = el.stream().peek(y -> System.out.println(y)).filter(f -> !st.add(f))
				.peek(y -> System.out.println(y)).collect(Collectors.toSet());

		System.out.println(fhgf);

		// find all numbers from array which starting from 1.

		List<Integer> daat = Arrays.asList(12, 122, 55);

		List<Integer> dares = daat.stream().filter(f -> !String.valueOf(f).startsWith("1"))
				.collect(Collectors.toList());

		System.out.println(dares);

		/**
		 * iterate map and list via forEach
		 */
		List<String> lstk = new ArrayList<String>();
		lstk.add("Hello");
		lstk.add("how");
		lstk.add("are");
		lstk.add("you");
		lstk.forEach(a -> System.out.println(a));
		
		Map<String,String> mp=new HashMap<String, String>();
		
		mp.put("sds", "sad");
		
		mp.forEach((a,b)->System.out.println("key" +a +" value "+b));
	}

}

class Employee {

	int id;
	String name;
	String dept;
	BigDecimal salary;

	public Employee(int id, String name, String dept, BigDecimal salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}