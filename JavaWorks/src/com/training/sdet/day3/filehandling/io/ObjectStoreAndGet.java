package com.training.sdet.day3.filehandling.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * 
 * @author Huser
 * @see this is for testing 
 * @since december 
 *
 */
public class ObjectStoreAndGet {
	
	//alt + shift + z
	public static void store(Laptop lappy){
		
		ObjectOutputStream oos = null;
		
		try {
			 oos = new ObjectOutputStream(
							new FileOutputStream("laptop.ser"));
			
			 oos.writeObject(lappy);
			 oos.writeInt(100);
			 oos.writeChars("Hello");
			 System.out.println("Data saved");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e){}
		}
		
	}
	
	public static Laptop getObject() {
		try {
			ObjectInputStream ois = new 
					ObjectInputStream(
					new FileInputStream("laptop.ser"));
			Laptop lappy = (Laptop) ois.readObject();
			System.out.println(ois.readInt());
			System.out.print(ois.readChar());
			System.out.print(ois.readChar());
			System.out.print(ois.readChar());
			System.out.print(ois.readChar());
			System.out.println(ois.readChar());
			return lappy;
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  } catch (ClassNotFoundException cnfe) {
				// TODO Auto-generated catch block
		}
		
		return null;
	}

	public static void main(String[] args) {
		
		Laptop lappy = new Laptop(1234, "Surface Pro", "Microsoft");
		
		//store(lappy);
		System.out.println(getObject());

	}

}
