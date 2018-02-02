package org.experiment.nirmalya.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

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
		
		public String reportableEmployee() {
			return ("Name=" + this.name + ",Age=" + this.age);
		}
		
		
	}
	  public static void main(String args[]){
		  
		FilteringUsage filteringUsage = new  FilteringUsage();  
		  
	    List<Employee> employeeList= 
	     Arrays.asList(
	      filteringUsage.new Employee("Tom Jones", 55), 
	      filteringUsage.new Employee("Harry Major", 25),
	      filteringUsage.new Employee("Ethan Hardy", 65),
	      filteringUsage.new Employee("Nancy Smith", 15),
	      filteringUsage.new Employee("Deborah Sprightly", 29));
	    
	    // TODO: print the names of all employees who are over 50 years of age!
	   
	 }
	 public static List<String> collectSeniorEmployees(
			 List<Employee> employeeList,
			 Supplier<String> supplier){
	   
		 List<String> reportableEmployeeList = new ArrayList<String>();
		 
		 for(Employee e: employeeList) {
			 
			 em
		 }
	   return reportableEmployeeList;
	  }
	}