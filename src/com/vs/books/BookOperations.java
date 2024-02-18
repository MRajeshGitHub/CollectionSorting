package com.vs.books;

import java.util.ArrayList;
import java.util.ListIterator;

public class BookOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> al= new ArrayList<Book>();
		al.add(new Book(123, "History","Arun"));
		al.add(new Book(124, "Novel","Willams"));
		al.add(new Book(125, "Maths","Hill"));
		al.add(new Book(126, "Physics","Tata"));
		System.out.println(al);
		//holding into ListIterator
		
		ListIterator <Book>litr=al.listIterator();
		//operation
		while(litr.hasNext()) {
		 Book k=litr.next();
		 System.out.println("itreator :"+litr.next());
			
			if(k.bid==123)
				litr.remove();
			if(k.author.equals("Tata"))
				litr.remove();
		}
		
	for(Book b:al) {
		
		System.out.println(b.bid+","+b.author+ " ,"+b.bname);
	}
		

	}}

