package answers.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ans_1 {
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

        // Section 2

        char[] arr = {'a', 'b', 'c'};

        try {
            System.out.println(arr[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
