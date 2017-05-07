package org.experiment.nirmalya.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class The8WayWithPojo {
	
	public class Author {
		
		private final String firstName;
		private final String lastName;
		public Author(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public String prettify() {
			return (this.lastName + "," + this.firstName);
		}
		
	}

	public static void main(String[] args) {
		
		The8WayWithPojo streamingDemonstrator = new The8WayWithPojo();
	
		List<Author> authors = new ArrayList<Author>();
		
		authors.add(streamingDemonstrator.new Author("William", "Shakespeare"));
		authors.add(streamingDemonstrator.new Author("Rabindranath", "Tagore"));
		authors.add(streamingDemonstrator.new Author("Gabriel", "Marqueze"));
		authors.add(streamingDemonstrator.new Author("Jane", "Austen"));
		authors.add(streamingDemonstrator.new Author("William", "Dalrymple"));
		
		Predicate<Author> williamChecker = new Predicate<Author>() {

			@Override
			public boolean test(Author t) {
				return(t.firstName.contains("William"));
			}
			
		};
		
		Function <Author,String> authToFirstName = new Function<Author,String> () {

			@Override
			public String apply(Author t) {
				return (t.firstName);
			}
			
		};
		
		authors.stream().filter(williamChecker).forEach(System.out::println);
		authors.stream().filter(williamChecker).map(authToFirstName).forEach(System.out::println);
		authors.stream().filter(williamChecker).map(Author::prettify).forEach(System.out::println);
		
	}
	
}
