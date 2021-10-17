package com.company;

public class Grandmother {
    private String name;
    private int age;
    private Home home;
    private NickNames nickNames;

    public Grandmother (String name, int age, Home home, NickNames nickNames) {
        this.name = name;
        this.age = age;
        this.home = home;
        this.nickNames = nickNames;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Home getHome() {
        return home;
    }

    public NickNames getNickNames() {
        return nickNames;
    }

    public String getInfo(){
        return "Name: " + name +
                "\nAge: " + age +
                "\nPlace of home: " + home.getAddress() +
                "\nNickname: " + nickNames;

    }
}
