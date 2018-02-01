package lesson22_26_static;

public class Main {

    public static void main(String... args) {

        System.out.println(ExamStatic.a);
        System.out.println(ExamStatic.get());

        ExamStatic.getInt();
        ExamStatic.getInt();
        ExamStatic.getInt();

        System.out.println(ExamStatic.a);

        ExamStatic.getInt();

        System.out.println(ExamStatic.a);

        System.out.println(Math.PI); // PI - static final
    }
}