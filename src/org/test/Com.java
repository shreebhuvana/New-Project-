package org.test;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Com {
public static void main(String[] args) {
	Map<Integer, Employee> e= new LinkedHashMap<>();
	Employee s = new Employee();
	s.setId(123);
	s.setName("Bhu");
	s.setPhno(9876543210l);
	Employee s1 = new Employee();
	s1.setId(456);
	s1.setName("Kavi");
	s1.setPhno(5678904321l);
	Employee s2 = new Employee();
	s2.setId(789);
	s2.setName("Sam");
	s2.setPhno(1234567890l);
	Employee s3 = new Employee();
	s3.setId(789);
	s3.setName("Sam");
	s3.setPhno(1234567890l);
	Employee s4 = new Employee();
	s3.setId(546);
	s3.setName("mmm");
	s3.setPhno(87778985883l);
	
	e.put(10,s);
	e.put(20,s1);
	e.put(30, s2);
	e.put(40, s3);
	e.put(50, s4);
	Set<Entry<Integer,Employee>> x = e.entrySet();
	for (Entry<Integer, Employee> v : x) {
		System.out.println(v.getKey());
		System.out.println("Employee Details");
		System.out.println(v.getValue().getId());
		System.out.println(v.getValue().getName());	
		System.out.println(v.getValue().getPhno());
		}
	}	
}
