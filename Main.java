package com.main3;
import com.publisher.Publisher;
import com.book.Book;


public class Main {
    public static void main(String[] args) {
	Publisher publisher=Publisher.getPublisherObject("Devi", "india", "pik2514");
	Book book=Book.getBookObject("xyz", "murthi", publisher, 5089);
	System.out.println(publisher);
	System.out.println();
	System.out.println("---Book Details---");
	System.out.println(book);
	}
	}