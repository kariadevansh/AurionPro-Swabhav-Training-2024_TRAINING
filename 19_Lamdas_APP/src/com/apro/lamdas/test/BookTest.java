package com.apro.lamdas.test;

import com.apro.lamdas.model.Book;
import com.apro.lamdas.model.BookConstructor;

public class BookTest {

	    public static void main(String[] args) {
	    	
//	    	BookConstructor bookConstructor1 = Book::new;
////	    	bookConstructor1.create(19.99, "The Great Gatsby", "F. Scott Fitzgerald");
//	    	System.out.println(bookConstructor1.create(19.99, "The Great Gatsby", "F. Scott Fitzgerald"));
	        
	        BookConstructor bookConstructor = (price, name, author) -> new Book(price, name, author);

	        Book myBook = bookConstructor.create(19.99, "The Great Gatsby", "F. Scott Fitzgerald");
	    	
	        System.out.println(myBook);
	    }
	

}
