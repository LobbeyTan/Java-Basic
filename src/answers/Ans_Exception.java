package answers;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ans_Exception {
    public static void main(String[] args) {

        /*
        You have learned how to handle various kind of Java Exception and in this exercise,
        you are going to have a practice on how Java Exception. Just as a reminder, you can
        use try-catch clause to handle exception. If you manage to complete all todolist,
        your program should execute without any errors.
         */

        System.out.println("=====================================");
        System.out.println("||             Question 1          ||");
        System.out.println("=====================================");

        // Let's start with reading a file
        // Note that you will not find the file for sure
        String filename = "Unknown.txt";

        try {
            FileReader reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            System.out.println(filename + " is not found");
        }

        System.out.println("\n=====================================");
        System.out.println("||             Question 2          ||");
        System.out.println("=====================================");

        /*
        If you handle the code successfully, you could continue continue the next question.
        Next we will create our own Java Exception class ['AnswerWrongException'].
        Go to the definition of AnswerWrongException and complete the exception.
         */

        try {
            wrongAnswer();
        } catch (AnswerWrongException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=====================================");
        System.out.println("||             Question 3          ||");
        System.out.println("=====================================");

        /*
        In this question, you are required to fill in the correct answer
        */

        int x = 10;
        int y = 15;
        int a = 25;
        int b = 33;
        int c = 11;

        int ans = 0;

        try {
            ans = x + y;

            if (ans == a) {
                System.out.println("Answer(a) is right");
            } else {
                System.out.println("Answer(a) is wrong");
            }

            // Purposely throw the exception
            throw new RuntimeException("Exception Occurs");
        } catch(RuntimeException ex) {

            ans += 8;

            if (ans == b) {
                System.out.println("Answer(b) is right");
            } else {
                System.out.println("Answer(b) is wrong");
            }

        } finally {

            ans /= 3;

            if (ans == c) {
                System.out.println("Answer(c) is right");
            } else {
                System.out.println("Answer(c) is wrong");
            }

        }
    }

    // Edit this CustomException
    static class AnswerWrongException extends Exception {
        private final String message;

        public AnswerWrongException(String message) {
            super(message);
            this.message = message;
        }

        @Override
        public String getMessage() {
            return "AnswerWrongException: " + this.message;
        }
    }


    public static void wrongAnswer() throws AnswerWrongException {
        // Purposely do it to get the wrong answer
        int a = 5;
        int b = 9;
        int ans = 10;

        if ((a + b) == ans) {
            System.out.println(a + " + " + b + " = " + ans);
        } else {
            throw new AnswerWrongException(a + " + " + b + " is not equal " + ans);
        }
    }
}

