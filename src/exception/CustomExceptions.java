package exception;

public class CustomExceptions {
    public String checkName(String name) throws NameNotFoundException {
        if(name.length() != 0) {
            return "Valid";
        }
        throw new NameNotFoundException("No name is found, please try again");
    }

    public boolean isUpperCase(String str) throws NotUpperCaseException, NullPointerException {
        String upper = str.toUpperCase();
        if(upper.equals(str)) {
            return true;
        }
        throw new NotUpperCaseException((str + " is not in uppercase"), new Throwable("Not UPPERCASE"));
    }

    public boolean isPalindrome(String str) throws NotPalindromeException, NullPointerException {
        int j = str.length() - 1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(j)) {
                throw new NotPalindromeException(new Throwable("Not PALINDROME"));
            }
        }
        return true;
    }

    public boolean isInteger(Number a) throws NotIntegerException{
        if(a instanceof Integer) {
            return true;
        }
        throw  new NotIntegerException((a.toString() + "is not an Integer"), new Throwable("Not INTEGER"), false, true);
    }

}

class NameNotFoundException extends Exception {
    public NameNotFoundException(String message) {
        super(message);
    }
}

class NotUpperCaseException extends Exception {
    public NotUpperCaseException(String message, Throwable cause) {
        super(message, cause);
    }
}

class NotPalindromeException extends Exception {
    public NotPalindromeException(Throwable cause) {
        super(cause);
    }
}

class NotIntegerException extends Exception {
    public NotIntegerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}