package lesson_25_29_forced_exception;

import java.io.PrintStream;

public class MyException extends Exception {

    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("Its my first exception");
    }
}
