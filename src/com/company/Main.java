package com.company;

public class Main {

    public static void main(String[] args) {

        Home home = new Home("4 Masaliev street");
        Mother upol = new Mother("Upol", 60, home, NickNames.LOSER, "Babysitter");
        System.out.println(upol.getInfo());
        upol.makeMoney("USD", 30000);

        System.out.println("--------------------------------------------------");


        Daughter daughter1 = new Daughter("Aigul", 1, home, NickNames.WINNER, "Unemployed");
        Daughter daughter2 = new Daughter("Aijan", 14, home, NickNames.FAILURE, "Unemployed", "School");
        System.out.println(daughter1.getInfo());

        daughter1.makeMoney("USD");

        System.out.println("--------------------------------------------------");

        System.out.println(daughter2.getInfo());
    }
}