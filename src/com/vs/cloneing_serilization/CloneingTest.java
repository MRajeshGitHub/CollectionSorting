package com.vs.cloneing_serilization;

public class CloneingTest implements Cloneable{
	int a=10;
	int b=20;

	public static void main(String[] args) throws CloneNotSupportedException {
		// Clone process in collection
		
		CloneingTest c= new CloneingTest();//class object
		
		System.out.println(c.a);
		System.out.println(c.b);//pint instance variable using class object

		//duplicate object using clone process
		//clone throw CloneNotSupportedException 
		//clone return class is object class
		CloneingTest t=(CloneingTest)c.clone();//clone the object and store into class object and print the cloned object values
	
		System.out.println(t.a);
		//print the cloned data using cloned object reference
		System.out.println(t.b);// java.lang.CloneNotSupportedException: to solve this we need to implements Cloneable Interface
		//cloneable is marker interface witch have some special capabilities to clone the class
		
		//clone data directly from heap memory
		
		CloneingTest t2= new CloneingTest();
		System.out.println(t2.a);
		System.out.println(t2.b);
		
		
		
		
		
	}
	

}
