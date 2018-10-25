package com.company;

public class HorseRunner {

    public static void main(String[] args) {
        Horse horse1 = new Mustang("Secretariat", 12000);
        Horse horse2 = new Mustang("Dusty Trail", 22000);
        Horse horse3 = new Mustang("Silver", 12000);
        Horse horse4 = new Thoroughbred("Bean", 16000);

        Horse[] horses = new Horse[8];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        horses[6] = horse4;
        HorseBarn barn = new HorseBarn(horses);

        /*
        System.out.println(barn);
        System.out.println(" Dusty Trail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Dusty Trail is now in space: " + barn.findHorseSpace("Dusty Trail"));

        */

        System.out.println(barn);
        System.out.println(" Bean is in space: " + barn.findHorseSpace("Bean"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Bean is now in space: " + barn.findHorseSpace("Bean"));
    }
}
