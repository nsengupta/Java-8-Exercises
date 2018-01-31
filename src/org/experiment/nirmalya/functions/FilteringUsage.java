package org.experiment.nirmalya.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FilteringUsage{
	
	class Employee {
		private final String name;
		private final Integer age;
		public Employee(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public Integer getAge() {
			return age;
		}
		
		
	}
	  public static void main(String args[]){
		  
		FilteringUsage functionUsage = new  FilteringUsage();  
		  
	    List<Employee> employeeList= 
	     Arrays.asList(
	      functionUsage.new Employee("Tom Jones", 55), 
	      functionUsage.new Employee("Harry Major", 25),
	      functionUsage.new Employee("Ethan Hardy", 65),
	      functionUsage.new Employee("Nancy Smith", 15),
	      functionUsage.new Employee("Deborah Sprightly", 29));
	    
	    // TODO: print the names of all employees who are over 50 years of age!
	   
	 }
	 public static List<String> collectSeniorEmployees(List<Employee> employeeList){
	   List<String> empNameList = null;
	   return empNameList;
	  }
	}