package lesson_26_31_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    List <Integer> list = new ArrayList();

        list.add(2);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(0);

        System.out.println(list.get(0));

        list.remove(0);


        System.out.println(" ");

        for(int n :list){
            System.out.println(n);
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println("");

        boolean empty = list.isEmpty();
        System.out.println(empty);

    }
}
