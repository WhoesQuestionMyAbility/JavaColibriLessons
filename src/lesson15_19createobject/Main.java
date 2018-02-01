package lesson15_19createobject;

public class Main {

    static Cat cat = new Cat();
    static People people = new People();
    public static void main(String[] args) {

        cat.name = "Lola";
        cat.breed ="None";
        cat.age = 3;

        people.name = "Rostislav";
        people.lastName = "Kuchin";
        people.age = 23;
        people.cat = cat;

        System.out.println(people);
        cat.say();
        people.cat.say();
    }
}
