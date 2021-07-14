package exercises.exceptions;

public class Exe_2 {
    public static void main(String[] args) {
        System.out.println("\n=====================================");
        System.out.println("||             Question 2          ||");
        System.out.println("=====================================");

        /*
        If you handle the code successfully, you could continue continue the next question.
        Next we will create our own Java Exception class ['AnswerWrongException'].
        Go to the definition of AnswerWrongException and complete the exception.
         */

        // Uncomment all the code and run

//        try {
//            wrongAnswer();
//        } catch (/*TODO(Handle correct exception)*/) {
//            //TODO(Print out the exception message)
//        }
    }

    // Uncomment the following class to create exception

//    static class AnswerWrongException /*TODO(Extend a class to make it an exception)*/ {
//        private final String message;
//
//        public AnswerWrongException(String message) {
//            super(message);
//            this.message = message;
//        }
//
//        @Override
//        public String getMessage() {
//            return "AnswerWrongException: " + /*TODO(Put your message here)*/;
//        }
//    }

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
