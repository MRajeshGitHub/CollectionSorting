package com.vs.linkedlist;

import java.util.LinkedList;

public class LinkedListUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Linked List use case and methods :");
		LinkedList<String> ll= new LinkedList<String>();
	
		ll.add("Rajeev");
		ll.add("Amit");
		ll.add("Kailash");
		ll.add("Veeramani");
		System.out.println(ll);//print as collection data
		//linked list operations
		ll.addFirst("Arjun");
		ll.addLast("Karan");
		System.out.println(ll);
		System.out.println(ll.size());//will return size of the list
		ll.add(2, "Neha");//will set neha at 2nd index in the list
		System.out.println(ll);
		ll.set(3, "laxmi");//will replace new data at 3rd index in list
		System.out.println(ll);
		ll.remove();//remove the list
		System.out.println(ll);
		System.out.println(ll.isEmpty());// boolelan value
		ll.clear();//clear the list
		System.out.println(ll);//empty list
		
		
		
		

	}

}
