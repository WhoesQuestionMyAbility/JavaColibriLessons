package lesson15_19createobject;

public class Cat {

    int age;
    String breed;
    String name;

    void say(){
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Cat[Имя: " + name + ", Порода: " + breed + " - " + age + " год(а)]"  ;
    }
}
