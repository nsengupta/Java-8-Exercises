package org.experiment.nirmalya.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.experiment.nirmalya.functions.FunctionUsage.Employee;

public class UsageWithSuppliers{
	
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
		
		public String serialNumber() {
			
			return new String("Name=" + this.name + ",Age=" + this.age);
		}
	}
	  public static void main(String args[]){
		  
		UsageWithSuppliers usageWithSuppliers = new  UsageWithSuppliers(); 
		
		
		  
	    List<Employee> allEmployeesInTheOrganization= 
	     Arrays.asList(
	      usageWithSuppliers.new Employee("Tom Jones", 55), 
	      usageWithSuppliers.new Employee("Harry Major", 25),
	      usageWithSuppliers.new Employee("Ethan Hardy", 65),
	      usageWithSuppliers.new Employee("Nancy Smith", 15),
	      usageWithSuppliers.new Employee("Deborah Sprightly", 29));
	    
	    List <String> allSeniorsNames = prepareReport(allEmployeesInTheOrganization,);
	    
	    for (String name: allSeniorsNames) {
	    	System.out.println(name);
	    }
	   
	 }
	 public static List<String> prepareReport(
			 List<Employee> originalEmployeeList,
			 Supplier<String> descriptionSupplier){
		 
	   	 
	   List<String> reportableEmployeeList = new ArrayList<String>();
	   
	   for(Employee emp:originalEmployeeList){
		
			   reportableEmployeeList.add(descriptionSupplier.get());
			   
	   }
	   
	   return reportableEmployeeList;
	  }
	}