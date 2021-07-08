package exception;

import java.io.*;

/*
===============================
Type of Built-in Java Exception
===============================

01. ArithmeticException
02. ArrayIndexOutOfBoundsException
03. ClassNotFoundException
04. FileNotFoundException
05. IOException
06. InterruptedException
07. NoSuchFieldException
08. NoSuchMethodException
09. NullPointerException
10. NumberFormatException
11. RuntimeException
12. StringIndexOutOfBoundsException
 */

public class Exceptions {
    public int divideBy0(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public int indexOutOfRange(int[] arr) throws IndexOutOfBoundsException {
        return arr[99];
    }

    public String noClassFound(String classname) throws ClassNotFoundException {
        return Class.forName(classname).toString();
    }

    public void readInvalidFile(String filename) throws FileNotFoundException {
        FileReader reader = new FileReader(filename);
    }
}
