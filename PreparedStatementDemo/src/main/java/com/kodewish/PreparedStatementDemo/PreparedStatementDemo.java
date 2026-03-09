package com.kodewish.PreparedStatementDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo
{
    public static void main( String[] args )
    {
        String url="jdbc:mysql://localhost:3306/jdbcPractice";
        String userName="root";
        String password="Kanha8728@";
        
        int batchSize=15;
        
        try (Connection con=DriverManager.getConnection(url,userName,password)){
        	String sql="insert into student values(?,?) ";
        	
        	PreparedStatement ps=con.prepareStatement(sql);
        	  for(int i=1;i<=20;i++) {
        		  ps.setInt(1, 1);
              	ps.setString(2, "abhinash"+i);
              	ps.addBatch();
              	System.out.println("adding to batch");
              	
              	if(i%batchSize==0) {
              		ps.executeBatch();//return type int array
              		System.out.println("Executing batch");
              	}
        	  }
        	
			System.out.println("sucessfully data entered");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
