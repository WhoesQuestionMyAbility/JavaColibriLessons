package lesson_27_32_set_collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List <String> list = new ArrayList();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");

        for(String item : list){
            System.out.println(item);
        }

        System.out.println("___________");



        Set <String> set = new HashSet();
        set.add("string0");
        set.add("string1");
        set.add("string");
        set.add("string2");
        set.add("string2");

        for(String s : set){
            System.out.println(s);
        }

        System.out.println("___________");

        set.remove("string1");

        Iterator <String> iterator = set.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }


        //childplays
        set.clear();
        boolean empty = set.isEmpty();

        System.out.println("");

        if(iterator.hasNext()){
            System.out.println(iterator.next());
        } else {

            System.out.println(empty);

        }

    }
}
