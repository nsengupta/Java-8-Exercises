package org.experiment.nirmalya.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciseWithStreams {
	
	public class NobelInformation {
		private final int    yearWon;
		private final String gender;
		public NobelInformation(int yearWon, String gender) {
			super();
			this.yearWon = yearWon;
			this.gender = gender;
		}
		public int getYearWon() {
			return yearWon;
		}
		public String getGender() {
			return gender;
		}
		
	    public String toString() {
	    	return ("Year=" + this.yearWon + ", Gender=" + this.gender);
	    }
	}
	
	public class Author {
		
		private final String firstName;
		private final String lastName;
		private final String isFrom;
		private final NobelInformation nobelInformation;
		public Author(String firstName, String lastName, String isFrom, NobelInformation nobelInformation) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.isFrom = isFrom;
			this.nobelInformation = nobelInformation;
		}
		
		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public String getIsFrom() {
			return isFrom;
		}

		public NobelInformation getNobelInformation() {
			return nobelInformation;
		}

		public Author(String firstName, String lastName, String isFrom) {
			this(firstName,lastName,isFrom,null);
		}
		public String prettify() {
			return (this.lastName + "," + this.firstName + "|" + this.nobelInformation.toString());
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
		
		ExerciseWithStreams exercise = new ExerciseWithStreams();
	
		List<Author> authors = new ArrayList<Author>();
		
		authors.add(exercise.new Author("William", "Shakespeare","England"));
		authors.add(exercise.new Author("Rabindranath", "Tagore","India",    exercise.new NobelInformation(1982,"MALE")));
		authors.add(exercise.new Author("Gabriel", "Marqueze","Mexico",      exercise.new NobelInformation(1982,"MALE")));
		authors.add(exercise.new Author("Jane", "Austen","England"));
		authors.add(exercise.new Author("William", "Dalrymple","Scotland"));
		authors.add(exercise.new Author("Samuel", "Beckett","Ireland",       exercise.new NobelInformation(1969,"MALE")));
		authors.add(exercise.new Author("Rudyard", "Kipling","England",      exercise.new NobelInformation(1907,"MALE")));
		authors.add(exercise.new Author("Pearl", "Buck","USA",               exercise.new NobelInformation(1938,"FEMALE")));
		authors.add(exercise.new Author("Nadine", "Gordimer","South Africa", exercise.new NobelInformation(1991,"FEMALE")));
		authors.add(exercise.new Author("", "Unknown","Unknown"));
		
		
		// TODO: Print the country and year of award for all FEMALE laureates.
		// TODO: Is there any Nobel Laureate from SriLanka in the list (print YES/NO)?
		// TODO: Find the number of Nobel Laureates in the list who are from England.
		
		
	}
	
}
