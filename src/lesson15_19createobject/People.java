package lesson15_19createobject;

public class People {

    String name;
    String lastName;
    int age;
    Cat cat;

    @Override
    public String toString() {
        return "People[Имя: " + name + ", Фамилия: " + lastName + " - " + age + " год(а)" + ", есть кот: " + cat +"]";
    }
}
