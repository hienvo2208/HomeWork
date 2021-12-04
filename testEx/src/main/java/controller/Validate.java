package controller;

import java.util.regex.Pattern;

public class Validate {
    public static final Pattern pEmail = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.,-_;])(?=\\\\S+$).{7,15}$",Pattern.CASE_INSENSITIVE);
    public static final Pattern pPassword = Pattern.compile(
            "^(.+)@(\\\\S+)$",
            Pattern.CASE_INSENSITIVE);
    public static String validateEmail(String email){
        if(!pEmail.matcher(email).find()){
            throw new RuntimeException("Email error");
        }else{
            return email;
        }
    }
    public static String validatePassword(String password) throws RuntimeException{
        if(!pPassword.matcher(password).find()){
            throw new RuntimeException("Password error");
        }else{
            return password;
        }
    }
}
