package stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String args[]) {
		int arr[] = { 12, 4, 5, 6, 7 };
		List<Integer> evenNumbers1 = Arrays.asList(23, 45, 4, 55);
		List<Integer> evenNumbers = evenNumbers1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

	
		//sum list of array
		
		evenNumbers1.stream().mapToInt(Integer::valueOf).sum();
		
		//count the sring with specific prefix 'P'
		
		List<String> lst=Arrays.asList("Priyanka","Priya","Chhaya","Ashutosh","Payal");
		long c=lst.stream().filter(f->f.startsWith("P")).count();
		System.out.print(c);
	
	
	}
	
	
	
	

}
