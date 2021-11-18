package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started");

        Menu begin = new Menu();
        begin.tellMe();
        begin.condition();
    }
}

class Menu {

    void tellMe() {
        System.out.println(" ");
        System.out.println("Chose option : ");
        System.out.println("1. Quit");
        System.out.println("2. Continue");
    }

    void condition() {
        List stock = new ArrayList();
        System.out.println(" ");
        System.out.println("Enter the correct number : ");
        Scanner condition = new Scanner(System.in);
        int number = condition.nextInt();

        if(number == 1) {
            System.out.println("The game stop");

        }else if(number == 2) {
            System.out.println("The game continue");

            Fight test = new Fight();

            Character player = new Character();

            System.out.println(" ");
            System.out.println("Chose your character : ");
            System.out.println("1 : Warrior");
            System.out.println("2 : Wizard");
            System.out.println("3 : Thief");
            System.out.println("4 : Classical");

            Scanner choseCharacter = new Scanner(System.in);
            int answer = choseCharacter.nextInt();

            if (answer == 1) {
                player = new Warrior();
                player.warriorCapacity();
            }else if (answer == 2) {
                player = new Wizard();
                player.wizardCapacity();
            }else if (answer == 3) {
                player = new Thief();
            }else if (answer == 4){
                player = new Classical();
            }else {
                System.out.println("This character doesn't exist");
                tellMe();
                condition();
            }

            System.out.println(" ");
            System.out.println("Player 1 :");
            player.caracteristics();
            stock.add(player.name);
            stock.add(player.damage);
            stock.add(player.life);
            stock.add(player.initiative);
            stock.add(player.type);

            Character player2 = new Character();

            System.out.println(" ");
            System.out.println("Chose your character : ");
            System.out.println("1 : Warrior");
            System.out.println("2 : Wizard");
            System.out.println("3 : Thief");
            System.out.println("4 : Classical");

            Scanner choseCharacter2 = new Scanner(System.in);
            int answer2 = choseCharacter2.nextInt();

            if (answer2 == 1) {
                player2 = new Warrior();
                player2.warriorCapacity();
            }else if (answer2 == 2) {
                player2 = new Wizard();
                player2.wizardCapacity();
            }else if (answer2 == 3) {
                player2 = new Thief();
            }else if (answer2 == 4){
                player2 = new Classical();
            }else {
                System.out.println("This character doesn't exist");
                tellMe();
                condition();
            }

            System.out.println(" ");
            System.out.println("Player 2 :");
            player2.caracteristics();
            stock.add(player2.name);
            stock.add(player2.damage);
            stock.add(player2.life);
            stock.add(player2.initiative);
            stock.add(player2.type);

            System.out.println("Player 1 : " + player);
            System.out.println("Player 2 : " + player2);

            System.out.println(" ");
            System.out.println("Begin of the Fight");

            boolean turn = true;
            int counter = 1;

            while (turn) {
                if (player.life <= 0) {
                    turn = false;
                    System.out.println(" ");
                    System.out.println("The winner is " + player2.name + ", who is a " + player2.type);
                } else if (player2.life <= 0) {
                    turn = false;
                    System.out.println(" ");
                    System.out.println("The winner is " + player.name + ", who is a " + player.type);
                } else {
                    System.out.println(" ");
                    System.out.println("Turn n°" + counter + " :");
                    test.damage(player, player2);
                }
                counter++;
            }

            System.out.println(" ");
            System.out.println("End of the Fight");

        }else {
            System.out.println("This feature doesn't exist");
            tellMe();
            condition();
        }
    }
}