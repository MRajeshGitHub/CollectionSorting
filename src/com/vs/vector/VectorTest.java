package com.vs.vector;

import java.util.Vector;


public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Vector data usecases:");
		Vector<Integer> v= new Vector<Integer>();
		//adding 30 element into vector list
		for(int i=0;i<=30;i++) {
			v.add(i);
		}
		
		java.util.Iterator<Integer> itr= v.iterator();//to porcess all element we need iterator
		while(itr.hasNext()) {
			//print even element and remove odd element
			Integer ii=itr.next();
			if(ii%2==0)
				System.out.println(ii);//even print
			else
				itr.remove();
			
		}
		System.out.println(v);//even print
		

	}

}
