package lesson24_28_exceptions;

public class Main {

    public static void main(String[] args) {

        String[] st = new String[2];

        try {
            System.out.println(st[5]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Элемент массива по данному индексу не существует!");
        }


    }

}
