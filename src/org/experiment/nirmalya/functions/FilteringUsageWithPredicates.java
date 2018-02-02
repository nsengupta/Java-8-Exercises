package org.experiment.nirmalya.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import org.experiment.nirmalya.functions.FunctionUsage.Employee;

public class FilteringUsageWithPredicates{
	
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
		
		public Boolean isSenior() {
			return (this.age > 50);
		}
	}
	  public static void main(String args[]){
		  
		FilteringUsageWithPredicates filteringUsage = new  FilteringUsageWithPredicates(); 
		
		
		  
	    List<Employee> allEmployeesInTheOrganization= 
	     Arrays.asList(
	      filteringUsage.new Employee("Tom Jones", 55), 
	      filteringUsage.new Employee("Harry Major", 25),
	      filteringUsage.new Employee("Ethan Hardy", 65),
	      filteringUsage.new Employee("Nancy Smith", 15),
	      filteringUsage.new Employee("Deborah Sprightly", 29));
	    
	    List <String> allSeniorsNames = collectNamesOfSeniorEmployees(allEmployeesInTheOrganization);
	    
	    for (String name: allSeniorsNames) {
	    	System.out.println(name);
	    }
	   
	 }
	 public static List<String> collectNamesOfSeniorEmployees(List<Employee> originalEmployeeList){
		 
		 
		 Predicate <Employee> senior = 
					new Predicate<Employee>() {

						@Override
						public boolean test(Employee t) {
							 return (t.isSenior());
						}
				        
		            };
	   	 
	   List<String> seniorEmployeeList = new ArrayList<String>();
	   
	   for(Employee emp:originalEmployeeList){
		   
		   if (senior.test(emp))
			   seniorEmployeeList.add(emp.name);
			   
	   }
	   
	   return seniorEmployeeList;
	  }
	}