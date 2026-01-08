package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class TryWithResourceDemo {
	//exploreing try with resources

	public static void main(String[] args) {
		try (Connection con=DriverManager.getConnection(null)){
			
		} catch (Exception e) {
			System.out.println("Inside exception hadler with sql connection");
			
		}

	}

}
