package com.company;

import java.util.Scanner;
import java.util.Random;

class Character {

    String name;
    int damage;
    int life;
    int initiative;
    String type;
    int shield;
    int magic;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

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

    public void wizardCapacity(){
        System.out.println("Enter your magic damage : ");
        Scanner magie = new Scanner(System.in);
        magic = magie.nextInt();
    }

    public void takeDamage(Character a){
        life = life - a.damage;
        System.out.println(a.name + " has " + a.life + " pv and received " + a.damage + " damage");
    }
}

class Warrior extends Character{

    public Warrior() {
        this.type = "Warrior";
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points he has " + shield + " shield points and he is a Warrior";
    }

    public void takeDamage(Character a){
        life = life - a.damage + shield;
        System.out.println(a.name + " has " + a.life + " pv and received " + a.damage + " damage and "+ shield + " shield protection");
    }
}

class Wizard extends Character{

    public Wizard() {
        this.type = "Wizard";
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points he has " + magic + "damage and he is a Wizard";
    }

    public void takeDamage(Character a){
        life = life - a.damage -magic;
        System.out.println(a.name + " has " + a.life + " pv and received " + a.damage + " damage and "+ magic + " magic damage");
        magic = magic/2;
    }

}

class Thief extends Character{
    int criticDamage;

    public Thief() {
        this.type = "Thief";
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Thief";
    }

    public void takeDamage(Character a){
        thiefDamage(a.damage);
        CriticDamage(a.damage);
//        life = life - a.damage -magic;
        System.out.println(a.name + " has " + a.life + " pv and received " + a.damage + " damage" );
//        magic = magic/2;
    }
    public boolean getDodge()
    {
        double value = Math.random(); //Création d'un nombre random entre 0 & 1

        if (value > 0.5) {
            return true;
        }

        else {
            return false;
        }
    }

    public void thiefDamage(int damage)
    {
        if (getDodge() == true) {
            life -= 0; //Il perd aucun pv
        }

        else {
            life -= damage; //Il perd le nombre de pv que l'attaquant lui envoie
        }
    }

    public void CriticDamage(int damage)
    {
        //Player critical attack
        double val2 = Math.random();
        if(val2>=0.5){
            life = life - damage ;
        }
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