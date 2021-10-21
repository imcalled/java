package com.queenie.survey;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*        4 - Create a survey questionnaire application that saves users answers to a file.
Think about the classes and that you might need. For example, Questionnaire
                - id, createdAt, List of Questions
                Question
                - the question
                Person
                - name, email, dob

                Use your imagination and go bananas with your implementation*/

public class Questionnaire {
    private String id;
    private String createdAt;
    private ArrayList<Question> listOfQs;
    private Person person = new Person();

    public Questionnaire(String id, ArrayList<Question> listOfQs) {
        this.id = id;
        this.listOfQs = listOfQs;
    }

    public void start() {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // File writer to write and save the file
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("someFIle.txt");

            for(Question n: listOfQs) {
                System.out.print(n);
                String userInput = scanner.nextLine();
                myWriter.write(String.valueOf(n));
                myWriter.write(userInput);
                myWriter.write(System.getProperty( "line.separator" ));
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}