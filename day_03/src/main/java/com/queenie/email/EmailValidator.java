package com.queenie.email;

//3 - Create package called email and inside have a class called EmailValidator with one public method. This method should accept a string and perform validation check.
// If the email does not contain the @ sign return false; if the email is valid return true.
//        Bonus: Use a Regular expressions to validate the email

public class EmailValidator {
    private String email;

    public EmailValidator(String email) {
        this.email = email;
    }

    public boolean isValid() {
        return this.email.contains("@");
    }
}