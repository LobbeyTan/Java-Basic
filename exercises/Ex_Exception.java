package exercises;

import java.io.FileReader;

public class Ex_Exception {
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
        } catch (/*TODO(ENTER correct exception here)*/) {
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
        } catch (/*TODO(Handle correct exception)*/) {
            //TODO(Print out the exception message)
        }

        System.out.println("\n=====================================");
        System.out.println("||             Question 3          ||");
        System.out.println("=====================================");

        /*
        In this question, you are required to fill in the correct answer
        */

        int x = 10;
        int y = 15;
        int a = // TODO(Put your answer here)
        int b = // TODO(Put your answer here)
        int c = // TODO(Put your answer here)

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
    static class AnswerWrongException /*TODO(Extend a class to make it an exception)*/ {
        private final String message;

        public AnswerWrongException(String message) {
            super(message);
            this.message = message;
        }

        @Override
        public String getMessage() {
            return "AnswerWrongException: " + /*TODO(Put your message here)*/;
        }
    }

    public static void wrongAnswer() /*TODO(Handle the exceptions)*/ {
        // Purposely do it to get the wrong answer
        int a = 5;
        int b = 9;
        int ans = 10;

        if ((a + b) == ans) {
            System.out.println(a + " + " + b + " = " + ans);
        } else {
            /*TODO(Throw our custom exception and print the message: [a + " + " + b + " is not equal " + ans])*/
        }
    }
}


