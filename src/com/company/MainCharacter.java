package com.company;

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

    public void takeDamages(Character a){
        life = life - a.damage;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage");

    }
}

class Warrior extends Character{

    public void takeDamages(Character a){
        life = life - a.damage + shield;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage and " + shield + " shield's protection");
    }

    public Warrior() {
        this.type = "Warrior";
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Warrior";
    }
}

class Wizard extends Character{

    public void takeDamages(Character a){
        life = life - a.damage - spell;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage and has " + a.spell + " Spell's damage");
    }

    public Wizard() {
        this.type = "Wizard";
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Wizard";
    }
}

class Thief extends Character{

    public void takeDamages(Character a){
       //Mettre voleur valeur
    }

    public Thief() {
        this.type = "Thief";
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


    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Classical Character";
    }
}

class DefaultCharacter extends Character{

    public void takeDamages(Character a){
        life = life - a.damage;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage");
    }


    public DefaultCharacter() {
        this.name = "Default";
        this.damage = 10;
        this.life = 100;
        this.initiative = 2;
        this.type = "Default Character";
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Default Character";
    }
}

class Devil extends Character{

    public void takeDamages(Character a){
        life = life - a.damage;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage");
    }

    public Devil() {
        this.name = "Devil";
        this.damage = 6666;
        this.life = 66666;
        this.initiative = 666;
        this.type = "GOD";
    }

    public String toString() {
        return "You are the " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a GOD";
    }
}
