package com.queenie.survey;

//import Email.EmailValidator;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
//        Exercise 1:
//        Person man = new Person("man", "person", Gender.MALE, LocalDate.of(1995, Month.JANUARY, 01));
//        Person woman = new Person("woman", "person", Gender.FEMALE, LocalDate.of(1990, Month.JANUARY, 01));
//        System.out.println(man.getFirstName());
//        System.out.println(man.getLastName());
//        System.out.println(man.getGender());
//        System.out.println(man.getDob());
//
//        System.out.println(woman.getFirstName());
//        System.out.println(woman.getLastName());
//        System.out.println(woman.getGender());
//        System.out.println(woman.getDob());

//        Exercise 4:
        //Create 5 Question objects
        Question question1 = new Question("What is your name? ");
        Question question2 = new Question("What is your email? ");
        Question question3 = new Question("What is your favourite colour? ");
        Question question4 = new Question("Do you have a pet? ");
        Question question5 = new Question("What is the capital of Australia? ");

        //Store all 5 questions in ArrayList object
        ArrayList<Question> listOfQuestions = new ArrayList<>();
        listOfQuestions.add(question1);
        listOfQuestions.add(question2);
        listOfQuestions.add(question3);
        listOfQuestions.add(question4);
        listOfQuestions.add(question5);

        Questionnaire questionnaire = new Questionnaire("01", listOfQuestions);
        questionnaire.start();
    }
}