package com.company;

import java.util.Scanner;

class Character {

    void caracteristics() {

        System.out.println("Entrez votre nom");
        Scanner nom = new Scanner(System.in);
        String name = nom.nextLine();

        System.out.println("Entrez vos dégats");
        Scanner degats = new Scanner(System.in);
        String damage = degats.nextLine();

        System.out.println("Entrez vos points de vies");
        Scanner vie = new Scanner(System.in);
        String life = vie.nextLine();

        System.out.println("Entrez vos points d'initiatives");
        Scanner initiaves = new Scanner(System.in);
        String initiative = initiaves.nextLine();

        System.out.println("Your name's character is " + name + ", inflict " + damage
                + " damages, has " + life + " lifes points and has " + initiative + " initiatives points");
    }

}

