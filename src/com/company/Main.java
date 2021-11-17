package com.company;

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

        System.out.println(" ");
        System.out.println("Entrez le nombre en question : ");
        Scanner condition = new Scanner(System.in);
        int number = condition.nextInt();

        if(number == 1) {

            System.out.println("The game stop");

        }else if(number == 2) {

            System.out.println("The game continue");

            System.out.println(" ");
            System.out.println("Chose your mode : ");
            System.out.println("1. Player VS AI");
            System.out.println("2. Player1 VS Player2");

            Scanner condition2 = new Scanner(System.in);
            int number2 = condition2.nextInt();

            if (number2 == 1) {         // Player VS AI

                Character player = new Character();
                player.caracteristics();
                System.out.println(player);

                DefaultCharacter playerDefault = new DefaultCharacter();
                System.out.println(playerDefault);
                
            }else if (number2 == 2) {   // Player vs Player

                Character player = new Character();
                player.caracteristics();
                System.out.println(player);

                Character player2 = new Character();
                player2.caracteristics();
                System.out.println(player2);

            }else {

                System.out.println("This mode doesn't exist");

            }

        }else {

            System.out.println("This feature doesn't exist");

        }
    }
}