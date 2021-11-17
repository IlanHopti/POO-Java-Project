package com.company;

import java.util.Scanner;

class Character {

    String name;
    int damage;
    int life;
    int initiative;

    public Character() {
        this.name = name;
        this.damage = damage;
        this.life = life;
        this.initiative = initiative;
    }

    void caracteristics() {

        System.out.println("Enter your name : ");
        Scanner nom = new Scanner(System.in);
        name = nom.nextLine();

        System.out.println("Enter your damage's points : ");
        Scanner degats = new Scanner(System.in);
        damage = degats.nextInt();

        System.out.println("Enter your life's points : ");
        Scanner vie = new Scanner(System.in);
        life = vie.nextInt();

        System.out.println("Enter your initiative's points : ");
        Scanner initiaves = new Scanner(System.in);
        initiative = initiaves.nextInt();
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points and he has " + initiative + " initiative's points";
    }
}

class DefaultCharacter extends Character{

    String nameDefault = "AI";
    int damageDefault = 10;
    int lifeDefault = 100;
    int initiativeDefault = 2;

    public DefaultCharacter() {
        this.nameDefault = nameDefault;
        this.damageDefault = damageDefault;
        this.lifeDefault = lifeDefault;
        this.initiativeDefault = initiativeDefault;
    }

    public String toString() {
        return "The AI player is " + nameDefault + ", he inflict " + damageDefault
                + " damage's points, he has " + lifeDefault + " life's points and he has " + initiativeDefault + " initiative's points";
    }
}
