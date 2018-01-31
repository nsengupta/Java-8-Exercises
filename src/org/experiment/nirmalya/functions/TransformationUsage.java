package org.experiment.nirmalya.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TransformationUsage{
	
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
		  
		TransformationUsage transformationUsage = new  TransformationUsage();  
		  
	    List<Employee> employeeList= 
	     Arrays.asList(
	      transformationUsage.new Employee("Tom Jones", 55), 
	      transformationUsage.new Employee("Harry Major", 25),
	      transformationUsage.new Employee("Ethan Hardy", 65),
	      transformationUsage.new Employee("Nancy Smith", 15),
	      transformationUsage.new Employee("Deborah Sprightly", 29));
	    
	    // TODO: print the initials of all employees!
	   
	 }
	 public static List<String> collectEmployeesByInitials(List<Employee> employeeList){
	   List<String> empNameList = null;
	   return empNameList;
	  }
	}