package com.vs.cloneing_serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerlizationTest {
	
	
	
	//Serialization method definition
	 void serilizationDemo() throws IOException  {
		  
		 Emp e= new Emp(101, "Ajay kumar");//writing the object value into streams
		 FileOutputStream fos= new FileOutputStream("abc.txt");// writing  object into text file
		 ObjectOutputStream oos= new ObjectOutputStream(fos);//convert into stream
		 oos.writeObject(e);
		 oos.close();//closed the stream
		 System.out.println("Serilization porcess is completed.....");
	 }
	 
	//Serialization method definition
	 void  deserilization() throws IOException, ClassNotFoundException {
		 FileInputStream fis= new FileInputStream("abc.txt");
		 ObjectInputStream ois= new ObjectInputStream(fis);
		 Emp e=(Emp)ois.readObject();
		 System.out.println(e.eid+","+e.ename);// print the object after deserilization
		 ois.close();//closed the channel
	 }

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serialization use cases
//callint the ser method
		SerlizationTest st= new SerlizationTest();
		st.serilizationDemo();// java.io.NotSerializableException: com.vs.cloneing_serilization.Emp ,To solve this we need to implements Emp class Serialization Interface
		st.deserilization();
		
	}

}
