package com.vs.collections;

import java.util.Stack;
import java.util.Vector;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stack use case with vector collection :");
		
		Stack<String> s= new Stack<String>();
		s.push("Rohan");
		s.push("Ajay");
		s.push("Kailash");
		s.push("Vinod");
		s.push("Mahesh");
		System.out.println(s);//print as collection
		//stack operation
		System.out.println(s.search("Ajay"));//search will return index form bottom of stack  
		System.out.println(s.pop());// pop will return last input element 
		System.out.println(s.peek());//peek will return top element of the stack
		System.out.println(s.empty());// empty will return boolean value about stack
		s.clear();//clear will return clear the stack
		System.out.println(s);//empty stack
		

		
	}

}
