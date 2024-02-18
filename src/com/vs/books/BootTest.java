package com.vs.books;

import java.util.ArrayList;
import java.util.Iterator;

public class BootTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Book object ");
		ArrayList<Book> al= new ArrayList<Book>();
		al.add(new Book(111, "Java", "goslin"));
		al.add(new Book(222, "C", "Denis"));
		al.add(new Book(333, "C++", "Bjarne"));
		al.add(new Book(444, "Python", "Guido"));
		System.out.println(al);//hash code will print
		
		//iterate the book object
		Iterator<Book> itr=al.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			if(b.bid==111)
				itr.remove();
			if(b.bname.equals("C"))
				itr.remove();
		
			if(b.author.equals("Guido"))
				itr.remove();
			//System.out.println(b.bid+" ,"+b.author+" ,"+b.bname);
		}
		
		System.out.println(al);
		for(Book s:al) {
			System.out.println(s.bid+" ,"+s.bname+" ,"+s.author);
		}

	}

}
