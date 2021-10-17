package com.company;

public final class Daughter extends Mother{
    private String study;

    public Daughter(String name, int age, Home home, NickNames nickNames, String profession, String study) {
        super(name, age, home, nickNames, profession);
        this.study = study;
    }

    public Daughter(String name, int age, Home home, NickNames nickNames, String profession) {
        super(name, age, home, nickNames, profession);
    }


    public String getStudy() {
        return study;
    }


    @Override
    void makeMoney(String currency, int amount) {
        super.makeMoney(currency, amount);
    }


    public String getInfo(){
        if (study != null) {
            return "Name: " + getName() +
                    "\nAge: " + getAge() +
                    "\nPlace of home: " + getHome().getAddress() +
                    "\nNickname: " + getNickNames() +
                    "\nPlace of study: " + study;

        } else {
            return "Name: " + getName() +
                    "\nAge" + getAge() +
                    "\nPlace of home: " + getHome().getAddress() +
                    "\nNickname: " + getNickNames();
        }

    }
}
