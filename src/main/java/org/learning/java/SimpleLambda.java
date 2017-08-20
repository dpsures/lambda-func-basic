package org.learning.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLambda {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Suresh"));
		empList.add(new Employee("Lokesh"));
		empList.add(new Employee("Bala"));
		empList.add(new Employee("Kamal"));
		empList.add(new Employee("Senthil"));
		
		empList.forEach(data -> {
			System.out.println("name --->"+data.getName());
		});
		
		List<Integer> counts = Arrays.asList(1,2,3,4,5,6,7,8,9);
		counts.forEach(System.out::println);
		
		Map<String, String> places = new HashMap<String,String>();
		places.put("name", "Suresh Kumar Devaraj");
		places.put("place", "Erode");
		
		places.forEach((a, b) -> {
			System.out.println(a + " --- "+b);
		});
		
	}
}