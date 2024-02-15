package com.vs.collections;

public class ArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("array print ");
		int arr[]= new int[5];
		System.out.println(arr);//will give hash code because arr is object in java
		for(int a:arr) {
			System.out.println(a);//will give default value
		}
	}

}
