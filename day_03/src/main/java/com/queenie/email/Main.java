package com.queenie.email;

//        Exercise 3:
//        EmailValidator email1 = new EmailValidator("email1email.com");
//        System.out.println(email1.isValidEmail());

public class Main {
    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator("k.z@gmail.com");
        validator.isValid();
    }
}
