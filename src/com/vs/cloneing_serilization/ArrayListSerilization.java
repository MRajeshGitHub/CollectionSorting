package com.vs.cloneing_serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// ArrayList collection with seriliazation with Emp object data
		
		ArrayList<Emp> al= new ArrayList<Emp>();
		al.add(new Emp(111, "Vijay"));
		al.add(new Emp(112, "Arun"));
		al.add(new Emp(113, "sanjay"));
		//serialization to araryList object : writing the object
		FileOutputStream fos= new FileOutputStream("abc.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("Serialization process completed..");
		
		
		//deserialization process
		
		FileInputStream fis= new FileInputStream("abc.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		ArrayList<Emp> eal= (ArrayList<Emp>) ois.readObject();
		
		System.out.println("Deserialization process completed");
		System.out.println("object data after deserialization :");
		for(Emp e:eal) {
			System.out.println(e.eid+","+e.ename);
		}
		ois.close();
		
		
		
		

	}

}
