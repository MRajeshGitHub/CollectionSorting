package com.vs.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Book operation with LinkedList :");
		
		LinkedList<Book> lk=new LinkedList<Book>();
		lk.add(new Book(147, "Java", "Goslin"));
		lk.add(new Book(148, "C", "Denice"));
		lk.add(new Book(149, "C++", "Bjarne"));
		lk.add(new Book(150, "Ptyhon", "Guido"));
	
		//print using forEach
		for(Book b:lk) {
			System.out.println(b.bid+","+b.bname+","+b.author);
		}
		System.out.println("-------------------------------");
		//Iterate print using ListIterator
		ListIterator<Book> l=lk .listIterator();
		while(l.hasNext()) {
			Book bk=l.next();//remove one object
			if(bk.bid==148)
				l.remove();
			if(bk.author.equals("C"))
				l.remove();
			System.out.println(bk.bid+","+bk.bname+","+bk.author);//print using ListIterator
		}
		System.out.println("-------------final list of data-----------");
		for(Book b:lk) {
			System.out.println(b.bid+","+b.bname+","+b.author);
		}
		
System.out.println("=============");
		Book b=lk.get(2);//print using get() method which is index based..
		System.out.println(b.bid+","+b.bname+","+b.author);
		
	}

}
