package org.learning.java.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.learning.java.Employee;

public class BasicStreamEx {

	public static void main(String[] args) {
		BasicStreamEx bs = new BasicStreamEx();
		bs.listStreamEx();
		bs.mapStreamEx();
	}
	
	private void listStreamEx(){
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Suresh", 30));
		empList.add(new Employee("Lokesh", 2));
		empList.add(new Employee("Bala", 3));
		empList.add(new Employee("Kamal", 33));
		empList.add(new Employee("Senthil", 40));
		
		List<Employee> emp = empList.stream().filter(employee -> employee.getAge() > 10)
		.collect(Collectors.toList());
		
		emp.forEach(e -> {
			System.out.println(e.getName()+" ---- "+e.getAge());
		});
	}

	
	private void mapStreamEx(){
		Map<String, Integer> data = new HashMap<String,Integer>();
		data.put("Suresh", 15);
		data.put("Lokesh", 9);
		data.put("Bala", 11);
		data.put("Kamal", 5);
		data.put("Senthil", 3);
		
		Map<String, Integer> result = data.entrySet().stream()
		.filter(d -> d.getValue() > 10)
		.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		
		result.entrySet().iterator().forEachRemaining(val -> {
			System.out.println(val.getKey() + " --- "+val.getValue());
		});
		
	}
}
