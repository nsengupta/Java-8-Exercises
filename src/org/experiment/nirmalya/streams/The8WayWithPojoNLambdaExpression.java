package org.experiment.nirmalya.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class The8WayWithPojoNLambdaExpression {
	
	public class Author {
		
		private final String firstName;
		private final String lastName;
		private final String isFrom;
		private final boolean hasWonNobel;
		public Author(String firstName, String lastName, String isFrom, boolean hasWonNobel) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.isFrom = isFrom;
			this.hasWonNobel = hasWonNobel;
		}
		
		public Author(String firstName, String lastName, String isFrom) {
			this(firstName,lastName,isFrom,false);
		}
		public String prettify() {
			return (this.lastName + "," + this.firstName);
		}
		
	}
	
	public class NobelLaureate {
		
		private final String firstName;
		private final String isFrom;
		public NobelLaureate(String firstName, String isFrom) {
			super();
			this.firstName = firstName;
			this.isFrom = isFrom;
		}
		public String prettify() {
			return (this.firstName + ", from " + this.isFrom);
		}
		
	}

	public static void main(String[] args) {
		
		The8WayWithPojoNLambdaExpression streamingDemonstrator = new The8WayWithPojoNLambdaExpression();
	
		List<Author> authors = new ArrayList<Author>();
		
		authors.add(streamingDemonstrator.new Author("William", "Shakespeare","England"));
		authors.add(streamingDemonstrator.new Author("Rabindranath", "Tagore","India",true));
		authors.add(streamingDemonstrator.new Author("Gabriel", "Marqueze","Mexico",true));
		authors.add(streamingDemonstrator.new Author("Jane", "Austen","England"));
		authors.add(streamingDemonstrator.new Author("William", "Dalrymple","Scotland"));
		authors.add(streamingDemonstrator.new Author("Samuel", "Beckett","Ireland",true));
		authors.add(streamingDemonstrator.new Author("", "Unknown","Unknown"));
		
		authors.stream().filter((p) -> p.firstName.contains("William")).forEach((x) -> System.out.println(x));
		authors.stream().filter((p) -> (!p.firstName.isEmpty()) && (p.firstName.contains("Gabriel"))).map(Author::prettify).forEach(System.out::println);
		
		List<Author> allKnownAuthors = authors.stream().filter((p) -> (!p.firstName.isEmpty())).collect(Collectors.toList());
		
		List<NobelLaureate> nobelLaureates = 
				authors
				.stream()
				.filter((p) -> (!p.firstName.isEmpty() && p.hasWonNobel))
				.map((p) -> streamingDemonstrator.new NobelLaureate(p.firstName,p.isFrom))
				.collect(Collectors.toList());
		
		Map<String,String> nobelWinnersAndCountries = 
				authors
				.stream()
				.filter((p) -> (!p.firstName.isEmpty() && p.hasWonNobel))
				.map((p) -> streamingDemonstrator.new NobelLaureate(p.firstName,p.isFrom))
				.collect(Collectors.toMap((NobelLaureate p) -> p.firstName, (NobelLaureate p) -> p.isFrom));
		
		nobelWinnersAndCountries.forEach((k,v) -> {
			System.out.println("Author =" + k + ", is from =" + v);
		});
		
		
		
		
		
	}
	
}
