package org.experiment.nirmalya.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TheOldWay {

	public static void main(String[] args) {
		
		TheOldWay streamingDemonstrator = new TheOldWay();
	
		List<String> authors = new ArrayList<String>();
		
		authors.add("William Shakespeare");
		authors.add("Rabindranath Tagore");
		authors.add("Gabriel Marqueze");
		authors.add("Jane Austen");
		
		List<String> selectedT = streamingDemonstrator.filterTraditionally(authors, "William");
		for (String n: selectedT) 
			System.out.println("Filtered: (" + n + ")");
		
		
        
	}
	
	
	private List<String> filterTraditionally(List<String> sourceList, String havingWord) {
		
		List<String> filteredAuthors = new ArrayList<String>();
		
		if (sourceList.isEmpty())
			return (filteredAuthors);
		else {
			
			Iterator<String> it = sourceList.iterator();
			
			while (it.hasNext()) {
				
				String nextAuthor = it.next();
				if (nextAuthor.contains(havingWord))
					filteredAuthors.add(nextAuthor);
			}
			return (filteredAuthors);
		}
	}

}
