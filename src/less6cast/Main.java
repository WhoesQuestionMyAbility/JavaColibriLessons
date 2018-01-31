package less6cast;

public class Main {

    static int a = 28;
    static double b = 4.5;
    static char ch1 = 'd';
    static char ch2 = 100;

    static Integer i = 23; //Reference type
    static Short sh = 5;
    static Float fl = 2.5f;
    static Double db = 7.8;
    static String s = "234";

    public static void main(String[] args){

        int c = (int) b; //Отбрасывает десятичную часть
        double b1 = (double) a; //Преобразование можно делать и без (double)
        int e = (int) ch1;

        Number n = fl;
        Number n1 = new Double(38.9);
        Integer r1 = n.intValue();
        Integer r2 = n1.intValue();

        Number n3 = db;
        int ns = n3.intValue();

        System.out.println(c);
        System.out.println(b1);
        System.out.println(e); //Вывод юникод
        System.out.println(ch2);//Unicode 100 = 'd'
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(ns);
    }
}
