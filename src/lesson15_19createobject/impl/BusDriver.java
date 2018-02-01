package lesson15_19createobject.impl;

import lesson15_19createobject.devpeople.People;

public class BusDriver implements Driver, Transport {

    private People people;
    private String category;
    private int speed = 60;

    @Override
    public void setCategory(String c) {
        this.category = c;
        people = new People("Bob", "Meelstack", 38, null);
    }

    @Override
    public void go() {
        if(people != null){
            System.out.println("Go!!!");
        } else {
            System.out.println("STOP!!! No driver!");
        }
    }

    @Override
    public int getSpeed() {
        if(people != null) {
            return this.speed;
        } else {
            return 0;
        }

    }
}
