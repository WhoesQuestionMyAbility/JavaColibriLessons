package lesson15_19createobject;

import lesson15_19createobject.devcat.Cat;
import lesson15_19createobject.devpeople.People;
import lesson15_19createobject.devprofs.Sportsman;

public class Main {

    static Cat cat;
    static People people;
    public static void main(String[] args) {

        cat  = new Cat(3, "None", "Lola");

        people = new People("Rostislav", "Kuchin", 23, cat);
        people.getCat().setName("George");
        System.out.println(people);
        cat.say();
        people.getCat().say();

        Sportsman sportsman = new Sportsman("Bob", "Denson", 36, null);
        sportsman.setTypeSport("Tennis");
    }
}
