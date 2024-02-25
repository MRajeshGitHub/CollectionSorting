package com.vs.cloneing_serilization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListInstance {

	public static void main(String[] args) {
		// ArrayList  By default implements instance of Interfaces
		
		ArrayList al= new ArrayList<>();
		System.out.println(al instanceof List);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof Serializable);
		System.out.println( al instanceof RandomAccess);
		
		LinkedList ll= new LinkedList<>();//linked list not support Random access Interface
		System.out.println(ll instanceof List);
		System.out.println(ll instanceof Cloneable);
		System.out.println(ll instanceof Serializable);
		System.out.println(ll instanceof RandomAccess);
		
		

	}

}
