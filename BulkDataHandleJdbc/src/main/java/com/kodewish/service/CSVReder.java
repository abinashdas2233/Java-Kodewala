package com.kodewish.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.kodewish.entity.Customer;

public class CSVReder {

    public static List<Customer> readCSV(String path) throws Exception {

        List<Customer> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {

            String data[] = line.split(",");

            Customer c = new Customer();

            c.setCustomerId(data[0]);
            c.setFirstName(data[1]);
            c.setLastName(data[2]);
            c.setEmail(data[3]);
            c.setPhone(data[4]);
            c.setCity(data[5]);
            c.setState(data[6]);
            c.setCountry(data[7]);
            c.setSignupDate(data[8]);
            c.setStatus(data[9]);

            list.add(c);
        }

        br.close();

        return list;
    }
}