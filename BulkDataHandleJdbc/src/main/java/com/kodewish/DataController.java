package com.kodewish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.kodewish.entity.Customer;
import com.kodewish.service.CSVReder;
import com.kodewish.service.Validator;

public class DataController {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbcPractice";
        String userName = "root";
        String password = "Kanha8728@";

        try {

            
        	List<Customer> list = CSVReder.readCSV("customer_data.csv");

            
            Connection con = DriverManager.getConnection(url, userName, password);

            String validQuery = "insert into customer_info values(?,?,?,?,?,?,?,?,?,?)";
            String invalidQuery = "insert into customer_info_invalid values(?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement psValid = con.prepareStatement(validQuery);
            PreparedStatement psInvalid = con.prepareStatement(invalidQuery);

           
            for (Customer c : list) {

                boolean valid = true;
                String error = "";

                if (!Validator.isNumeric(c.getCustomerId())) {
                    valid = false;
                    error = "Invalid Customer ID";
                }

                if (!Validator.isNameValid(c.getFirstName())) {
                    valid = false;
                    error = "Invalid First Name";
                }

                if (!Validator.isEmailValid(c.getEmail())) {
                    valid = false;
                    error = "Invalid Email";
                }

                if (valid) {

                    psValid.setInt(1, Integer.parseInt(c.getCustomerId()));
                    psValid.setString(2, c.getFirstName());
                    psValid.setString(3, c.getLastName());
                    psValid.setString(4, c.getEmail());
                    psValid.setString(5, c.getPhone());
                    psValid.setString(6, c.getCity());
                    psValid.setString(7, c.getState());
                    psValid.setString(8, c.getCountry());
                    psValid.setString(9, c.getSignupDate());
                    psValid.setString(10, c.getStatus());

                    psValid.addBatch();

                } else {

                    psInvalid.setString(1, c.getCustomerId());
                    psInvalid.setString(2, c.getFirstName());
                    psInvalid.setString(3, c.getLastName());
                    psInvalid.setString(4, c.getEmail());
                    psInvalid.setString(5, c.getPhone());
                    psInvalid.setString(6, c.getCity());
                    psInvalid.setString(7, c.getState());
                    psInvalid.setString(8, c.getCountry());
                    psInvalid.setString(9, c.getSignupDate());
                    psInvalid.setString(10, c.getStatus());
                    psInvalid.setString(11, error);

                    psInvalid.addBatch();
                }
            }

            
            psValid.executeBatch();
            psInvalid.executeBatch();

            System.out.println("Batch Insert Completed");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}