package answers.exceptions;

public class Ans_3 {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("||             Question 3          ||");
        System.out.println("=====================================");

        /*
        In this question, you are required to fill in the correct answer
        */

        int x = 10;
        int y = 15;
        int a = 25; // Ans a
        int b = 33; // Ans b
        int c = 11; // Ans c

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
}
