package lessontwovariables;

public class Main {

    //Integer type
    static byte b = 10; //8bit
    static   short sh = 21; //16bit
    static int i = 2341; //32bit
    static long l = 213123; //64bit

    //Float type
    static float fl = 123.24f; //32bit
    static double db = 123.125; //64bit

    //Boolean type
    static boolean bool1 = true;
    static boolean bool2 = false;

    //Reference type
    static String s = "Hello Unicorn";
    //Char type
    static char c = 'd'; //

    static final int CONST = 55; //Объявление константы через final. Изменение привет к ошибке

    public static void main(String[] args) {
        System.out.print(CONST);
        //CONST=88; ошибка
    }
}
