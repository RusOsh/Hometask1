package com.company;

public class Mother extends Grandmother {
    private String profession;

    public Mother (String name, int age, Home home, NickNames nickNames, String profession) {
        super(name, age, home, nickNames);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }



    void makeMoney(String currency, int amount) {
        System.out.println(currency + ": " + amount);
    }



    final void makeMoney(String currency) {
        System.out.println(currency);
    }

    public String getInfo() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nPlace of home: " + getHome().getAddress() +
                "\nNickname: " + getNickNames();

    }
}
