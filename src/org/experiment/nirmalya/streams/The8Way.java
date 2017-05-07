package org.experiment.nirmalya.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class The8Way {

	public static void main(String[] args) {
		
		The8Way streamingDemonstrator = new The8Way();
	
		List<String> authors = new ArrayList<String>();
		
		authors.add("William Shakespeare");
		authors.add("Rabindranath Tagore");
		authors.add("Gabriel Marqueze");
		authors.add("Jane Austen");
		
		Predicate<String> williamChecker = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return(t.contains("William"));
			}
			
		};
		
		authors.stream().filter(williamChecker).forEach(System.out::println);
		
	}
	
}
