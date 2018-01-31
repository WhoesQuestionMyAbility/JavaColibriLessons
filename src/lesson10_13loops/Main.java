package lesson10_13loops;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for(int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }

        System.out.println(" ");

        int i = 0;
        while (i < 10){
            System.out.print(i + " ");
            i++;
        }

        System.out.println(" ");


        int j = 10;
        while (j > 0){
            System.out.print(j + " ");
            j--;
        }

        System.out.println(" ");

       String[] st = "Hello World 1230 POws, --09".split(" ");
       for(String s : st){
           System.out.println(s);
       }
    }
}
