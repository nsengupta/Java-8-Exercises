package org.experiment.nirmalya.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionUsage{
	
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
		  
		FunctionUsage functionUsage = new  FunctionUsage();  
		  
	    Function<Employee, String> funcEmpToString= (Employee e)-> {return e.getName();};
	    List<Employee> employeeList= 
	     Arrays.asList(
	      functionUsage.new Employee("Tom Jones", 45), 
	      functionUsage.new Employee("Harry Major", 25),
	      functionUsage.new Employee("Ethan Hardy", 65),
	      functionUsage.new Employee("Nancy Smith", 15),
	      functionUsage.new Employee("Deborah Sprightly", 29));
	    
	    Function<String,String> initialFunction= (String s)->s.substring(0,1);
	    List<String> empNameListInitials=convertEmpListToNamesList(employeeList, funcEmpToString.andThen(initialFunction));
	    empNameListInitials.forEach(str->{System.out.print(" "+str);});
	 }
	 public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString){
	   List<String> empNameList=new ArrayList<String>(); 
	   for(Employee emp:employeeList){
	     empNameList.add(funcEmpToString.apply(emp));
	   }
	   return empNameList;
	  }
	}