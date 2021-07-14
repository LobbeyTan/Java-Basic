package answers.exceptions;

public class Ans_2 {
    public static void main(String[] args) {
        System.out.println("=====================================");
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
    }

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
