package com.company;

import java.util.Random;
import java.util.Scanner;

class Character {

    String name;
    int damage;
    int life;
    int initiative;
    String type;
    int shield;
    int spell;

    public Character() {
        this.name = name;
        this.damage = damage;
        this.life = life;
        this.initiative = initiative;
        this.type = type;
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

    void tellMe() {
        System.out.println("Perso claqué");
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points";
    }

    public void warriorCapacity() {
        System.out.println("Enter your shield's points : ");
        Scanner bouclier = new Scanner(System.in);
        shield = bouclier.nextInt();
    }

    public void wizardCapacity() {
        System.out.println("Enter your spell's points : ");
        Scanner sort = new Scanner(System.in);
        spell = sort.nextInt();
    }
}

class Warrior extends Character{

    public Warrior() {
        this.type = "Warrior";
    }

    void tellMe() {
        System.out.println("possède un bouclier qui réduit les dégâts infligés d'une valeur constante");
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Warrior";
    }
}

class Wizard extends Character{

    public Wizard() {
        this.type = "Wizard";
    }

    void tellMe(Character player) {
        System.out.println("inflige des dégâts magiques se rajoutant aux dégâts de base, " +
                "mais ces dégâts magiques réduisent de moitié après chaque attaque");
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Wizard";
    }
}

class Thief extends Character{

    public Thief() {
        this.type = "Thief";
    }

    void tellMe() {
        System.out.println("possède une probabilité d'esquiver totalement une attaque, " +
                "et possède également une probabilité d'infliger un coup critique qui doublera les dégâts de base");
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Thief";
    }
}

class Classical extends Character{

    public Classical() {
        this.type = "Classical Character";
    }

    void tellMe() {
        System.out.println("perso de base");
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Classical Character";
    }
}

class Devil {

    String name = "Devil";
    int damage = 6666;
    int life = 66666;
    int initiative = 666;
    String type = "God";

    public Devil() {
        this.name = name;
        this.damage = damage;
        this.life = life;
        this.initiative = initiative;
        this.type = "God";
    }

    public String toString() {
        return "You are the " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and your are a God";
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
                + " damage's points, he has " + lifeDefault + " life's points, he has " + initiativeDefault +
                " initiative's points";
    }
}