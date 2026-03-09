package com.kodewish.service;

import java.util.regex.Pattern;

public class Validator {
	public static boolean isNumeric(String value){
        return value.matches("\\d+");
    }

    public static boolean isNameValid(String name){
        return name.matches("[a-zA-Z]+");
    }

    public static boolean isEmailValid(String email){
        String regex="^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(regex,email);
    }

}
