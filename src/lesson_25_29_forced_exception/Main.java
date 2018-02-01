package lesson_25_29_forced_exception;

public class Main {

    public static void main(String[] args) {

        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}
