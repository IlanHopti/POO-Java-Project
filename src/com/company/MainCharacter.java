package com.company;

import java.lang.constant.Constable;
import java.util.Scanner;

class Character {

    String type;
    String name;
    int damage;
    int life;
    int initiative;

    public Character() {
        this.type = type;
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

    void tellMe() {
        System.out.println("Perso claqué");
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points";
    }
}

class Warrior extends Character{

    String type = "Warrior";

    public Warrior() {
        this.type = type;
    }

    void tellMe() {
        System.out.println("possède un bouclier qui réduit les dégâts infligés d'une valeur constante");
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a " + type;
    }

    public String getType() {
        return type;
    }
}

class Wizard extends Character{

    String type = "Wizard";

    public Wizard() {
        this.type = type;
    }

    void tellMe() {
        System.out.println("inflige des dégâts magiques se rajoutant aux dégâts de base, " +
                "mais ces dégâts magiques réduisent de moitié après chaque attaque");
    }
    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a " + type;
    }

    public String toString(String type) {
        return type;
    }
}

class Thief extends Character{

    String type = "Thief";

    public Thief() {
        this.type = type;
    }

    void tellMe() {
        System.out.println("possède une probabilité d'esquiver totalement une attaque, " +
                "et possède également une probabilité d'infliger un coup critique qui doublera les dégâts de base");
    }
    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a " + type;
    }

    public String toString(String type) {
        return type;
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