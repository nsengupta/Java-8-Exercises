package org.experiment.nirmalya;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

	public static void main(String[] args) {
	
		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 10; i += 2)
		    li.add(i); // Uses Integer.valueOf()
		
		li.forEach(e -> System.out.println(e));
		
		Double someD = new Double(10.2);
		Double someOtherD = new Double(1);
		
		System.out.println(someD);
		System.out.println(someOtherD);
		
		List<Double> ld = new ArrayList<>();
		
		/*for (int i = 1; i < 10; i += 2)
		    ld.add(i); // Cannot accept!
	
		ld.forEach(e -> System.out.println(e));
		*/
		
		Integer i1 = new Integer(2);
		Integer i2 = new Integer(2);
		
		System.out.println(i1 == i2 ? "Equal" : "Unequal");
		
		System.out.println(i1.equals(i2) ? "Equal" : "Unequal");
		
		Integer i3 = new Integer(255);
		Integer i4 = new Integer(255);
		
        System.out.println(i3 == i4 ? "Equal" : "Unequal");
		
		System.out.println(i3.equals(i4) ? "Equal" : "Unequal");
		
		System.out.println(Integer.toUnsignedString(-12));
		
		System.out.println(Integer.toUnsignedString(12));
		
		System.out.println(Integer.toBinaryString(-12));
		
		System.out.println(Integer.toBinaryString(12));
		
		System.out.println(Integer.parseUnsignedInt("11111111111111111111111111110100", 2));

	}

}
