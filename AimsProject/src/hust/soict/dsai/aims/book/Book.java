package hust.soict.dsai.aims.book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import hust.soict.dsai.aims.media.Media;
public class Book extends Media {
	
	public Book(String title, String category, float cost , List<String> authors,int length) {
		super(title, category, cost );
		this.length = length;
		this.authors = authors;
	}
	
	private String content;
	private List<String> contentTokens;
	private Map<String, Integer> wordFrequency= new TreeMap<String, Integer>();;
	private int length ;
	public void processContent() {
		String delimiters = "\\s+|,\\s*|\\.\\s*";
		contentTokens = Arrays.asList(content.split(delimiters));
		Collections.sort(contentTokens);
//		Collections.sort(contentTokens, Collator.getInstance());
		
		for (String t : contentTokens) {
            Integer c = wordFrequency.get(t);
            wordFrequency.put(t, (c == null) ? 1 : c + 1);
        }
			    
 
//        for (Map.Entry m : wordFrequency.entrySet())
//            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	}
	
	public Book() {
		
	}

	public Book(String title, String category, float cost, List<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}
	private List<String> authors = new ArrayList<String>();
	public void addAuthor(String authorName) {
		for ( String x : this.authors) {
			if (authorName.equals(x)) {
				System.out.println("author already in");
				return ;
			}
		}
			this.authors.add(authorName);
		}
		public void removeAuthor(String authorName) {
			for ( String x : this.authors) {
				if (authorName.equals(x)) {
					this.authors.remove(x);
		               }
		
              }
		}
		@Override
		public String toString() {
			return "Book: "+"title =" + getTitle() +", authors=" + authors 
					+ ", Category =" + getCategory() + ", content length = " + length + " token list: "+ contentTokens+"\n"+"word frequency: "+ wordFrequency  ;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
			this.processContent();
			this.length = contentTokens.size();
		}
		
}
