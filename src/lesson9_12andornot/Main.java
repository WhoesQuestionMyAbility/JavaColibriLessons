package lesson9_12andornot;

public class Main {
/*&& = И
*|| = ИЛИ
*! = НЕТ/НЕ
 */

    public static void main(String[] args) {

        int a = 5;
        int b = 9;
        boolean bool = false;

        if (!(a == b) && !bool){
            System.out.println("Itsa truel");
        }

        if (!(a == b) || bool){
            System.out.println("halftrueel");
        }
    }
}
