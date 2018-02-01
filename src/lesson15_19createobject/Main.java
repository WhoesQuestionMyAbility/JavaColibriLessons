package lesson15_19createobject;

import lesson15_19createobject.devcat.Cat;
import lesson15_19createobject.devpeople.People;

public class Main {

    static Cat cat = new Cat();
    static People people = new People();
    public static void main(String[] args) {

        cat.setName("Lola");
        cat.setBreed("None");
        cat.setAge(3);

        people.setName("Rostislav");
        people.setLastName("Kuchin");
        people.setAge(23);
        people.setCat(cat);

        System.out.println(people);
        cat.say();
        people.getCat().say();
    }
}
