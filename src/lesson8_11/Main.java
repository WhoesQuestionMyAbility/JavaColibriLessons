package lesson8_11;

public class Main {

    static boolean bool = false;
    static boolean bool1 = true;
    static int a = 3; // a = 2 ; a = 5

    public static void main(String[] args) {

/*1*/   if (bool) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }

/*2*/   if (bool1) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }

/*3*/   if (a == 3) {                          // НЕ ЗЛОУПОТРЕБЛЯТЬ ИФАМИ
            System.out.println("a = 3");
        }else if (a < 3){
            System.out.println("a < 3");
        }else if (a > 3) {
            System.out.println("a > 3");
        }

        switch (6) {  //также может принимать значение a
            case 5:
                System.out.println("5");
                break; //Чтобы завершался свитч после выполнения и не переходил на след.

            case 6:
                System.out.println("6");
                break;

            case 1:
                System.out.println("1");
                break;
        }
    }
}
