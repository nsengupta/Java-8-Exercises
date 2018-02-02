package org.experiment.nirmalya.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import org.experiment.nirmalya.functions.FunctionUsage.Employee;

public class ExerciseFiltering{
	
	class Employee {
		private final String name;
		private final Integer age;
		private final String  role;
		public Employee(String name, Integer age) {
			this(name,age,"Employee");
		}
		public Employee(String name, Integer age, String role) {
			super();
			this.name = name;
			this.age = age;
			this.role = role;
		}
		public String getName() {
			return name;
		}
		public Integer getAge() {
			return age;
		}
		public String getRole() {
			return role;
		}
		
		
	}
	  public static void main(String args[]){
		  
		ExerciseFiltering exerciseFiltering = new  ExerciseFiltering(); 
		  
	    List<Employee> allEmployeesInTheOrganization= 
	     Arrays.asList(
	      exerciseFiltering.new Employee("Tom Jones", 55,"Manager"), 
	      exerciseFiltering.new Employee("Harry Major", 25),
	      exerciseFiltering.new Employee("Ethan Hardy", 65),
	      exerciseFiltering.new Employee("Nancy Smith", 28),
	      exerciseFiltering.new Employee("Pat Woodham", 39,"Supervisor"),
	      exerciseFiltering.new Employee("Chris Oden", 50,"Manager"),
	      exerciseFiltering.new Employee("Samantha Lenisky", 29));
	    
	    // TODO: print names of employees who are either Managers or Employees.
	    // TODO: print surnames of employees who are Seniors.
	   
	   
	 }
	 public static List<String> collectNamesOfSeniorEmployees(List<Employee> originalEmployeeList){
		 
	   	 
	   List<String> seniorEmployeeList = new ArrayList<String>();
	   
	   
	   return seniorEmployeeList;
	  }
	}