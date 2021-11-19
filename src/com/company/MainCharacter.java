package com.company;

import java.util.Scanner;

class Character {

    //Set variables
    String name;
    int damage;
    int life;
    int initiative;
    String type;
    int shield;
    int spell;

    //Set character to choice in the display
    void displayCharacter(String nameD, int damageD, int lifeD, int initiativeD, String typeD) {

        System.out.println("You are " + nameD + ", he inflict " + damageD
                + " damage's points, he has " + lifeD + " life's points, he has " + initiativeD +
                " initiative's points and you are a " + typeD);
    }

    //Set controller
    public Character() {
        this.name = name;
        this.damage = damage;
        this.life = life;
        this.initiative = initiative;
        this.type = type;
    }

    void caracteristics() {

        //Set name
        System.out.println("Enter your name : ");
        Scanner nom = new Scanner(System.in);
        name = nom.nextLine();

        //Set damage's points
        System.out.println("Enter your damage's points : ");
        Scanner degats = new Scanner(System.in);
        damage = degats.nextInt();

        //Set life's points
        System.out.println("Enter your life's points : ");
        Scanner vie = new Scanner(System.in);
        life = vie.nextInt();

        //Set initiative's points
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
        //Set shield's value
        System.out.println("Enter your shield's points : ");
        Scanner bouclier = new Scanner(System.in);
        shield = bouclier.nextInt();
    }

    public void wizardCapacity() {
        //Set spell's value
        System.out.println("Enter your spell's points : ");
        Scanner sort = new Scanner(System.in);
        spell = sort.nextInt();
    }

    public void takeDamages(Character a){
        //Set attack's damage
        life = life - a.damage;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage");

    }

}

class Warrior extends Character{

    public void takeDamages(Character a){
        //Set attack's damage
        life = life - a.damage + shield;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage and " + shield + " shield's protection");
    }

    //Set controller
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
        //Set attack's damage
        life = life - a.damage - spell;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage and has " + spell + " Spell's damage");
        spell = spell / 2;
    }

    //Set controller
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

    public Thief() {
        this.type = "Thief";
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Thief";
    }

    public void takeDamages(Character a){
        thiefDamage(a.damage);
        CriticDamage(a.damage);
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage" );

    }
    public boolean getDodge() {
        //Creation of a number between 0 and 1
        double value = Math.random();

        if (value > 0.5) {
            return true;
        }else {
            return false;
        }
    }

    public void thiefDamage(int damage) {
        if (getDodge() == true) {
            life -= 0;
        }else {
            life -= damage;
        }
    }

    public void CriticDamage(int damage) {
        //Player critical attack
        double val2 = Math.random();
        if(val2>=0.5){
            life = life - damage ;
        }
    }
}

class Classical extends Character{

    public void takeDamages(Character a){
        //Set attack's damage
        life = life - a.damage;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage");
    }

    //Set controller
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
        //Set attack's damage
        life = life - a.damage;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage");
    }

    //Set controller
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

class EasterEgg extends Character{

    public void takeDamages(Character a){
        //Set attack's damage
        life = life - a.damage;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage");
    }

    //Set controller
    public EasterEgg() {
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
