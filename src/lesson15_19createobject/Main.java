package lesson15_19createobject;

import lesson15_19createobject.devcat.Cat;
import lesson15_19createobject.devpeople.People;
import lesson15_19createobject.devprofs.Sportsman;
import lesson15_19createobject.impl.BusDriver;
import lesson15_19createobject.impl.Driver;

public class Main {

    static Cat cat;
    static People people;
    public static void main(String[] args) {

        cat  = new Cat(3, "None", "Lola");

        people = new People("Rostislav", "Kuchin", 23, cat);
        people.getCat().setName("George");
        System.out.println(people);
        people.sayHello();
        cat.say();
        people.getCat().say();

        System.out.println();

        Sportsman sportsman = new Sportsman("Bob", "Denson", 36, null);
        sportsman.setTypeSport("Tennis");
        System.out.println(sportsman);
        sportsman.sayHello();

        System.out.println();

        BusDriver busDriver = new BusDriver();
        busDriver.setCategory("B");
        busDriver.go();
        System.out.println(busDriver.getSpeed());


    }
}
