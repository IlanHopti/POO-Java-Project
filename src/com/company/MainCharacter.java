package com.company;

import java.util.Scanner;

class Character {

    void caracteristics() {

        System.out.println("Enter your name : ");
        Scanner nom = new Scanner(System.in);
        String name = nom.nextLine();

        System.out.println("Enter your damage's points : ");
        Scanner degats = new Scanner(System.in);
        String damage = degats.nextLine();

        System.out.println("Enter your life's points : ");
        Scanner vie = new Scanner(System.in);
        String life = vie.nextLine();

        System.out.println("Enter your initiative's points : ");
        Scanner initiaves = new Scanner(System.in);
        String initiative = initiaves.nextLine();

        System.out.println("Your player is " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points and he has " + initiative + " initiative's points");
    }

}

