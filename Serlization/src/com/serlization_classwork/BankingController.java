package com.serlization_classwork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BankingController {
	public static void main(String[] args) {
		BankAccount account=new BankAccount(4000.00, "ureka_343", "abhi");
		
		try {
			//serialization (converting object->byte stream)
			FileOutputStream fs=new FileOutputStream("localData.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fs);
			oos.writeObject(account);
			System.out.println("serilization done..");
			
			
			
			//Deserialization (converting byte-stream->Objet)
			FileInputStream fi=new FileInputStream("localData.ser");
			ObjectInputStream op=new ObjectInputStream(fi);
			
			BankAccount res=(BankAccount) op.readObject();
			
			System.out.println(res.toString());
			
			System.out.println("Deserilization done..");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
