package hust.soict.dsai.test.book;

import java.util.ArrayList;

import hust.soict.dsai.aims.book.Book;

public class BookTest {
	public static void main(String[] args) {
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Khanh");
		authors.add("kHanh2");
		Book book =new Book("Aladin", "Animation", 18.99f, authors);
		book.setContent("Split the content into tokens by spaces or punctuations, then sort these tokens from a to z and set");
		System.out.print(book);
		
	}
}
