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

            if (number2 == 1) {

                Character player = new Character();
                player.caracteristics();
                System.out.println(player);
                stock.add(player.name);
                stock.add(player.damage);
                stock.add(player.life);
                stock.add(player.initiative);

                DefaultCharacter playerDefault = new DefaultCharacter();
                System.out.println(playerDefault);
                stock.add(playerDefault.nameDefault);
                stock.add(playerDefault.damageDefault);
                stock.add(playerDefault.lifeDefault);
                stock.add(playerDefault.initiativeDefault);

            }else if (number2 == 2) {
                Character player = new Character();
                player.caracteristics();
                stock.add(player.name);
                stock.add(player.damage);
                stock.add(player.life);
                stock.add(player.initiative);

                Character player2 = new Character();
                player2.caracteristics();
                System.out.println(player2);
                stock.add(player2.name);
                stock.add(player2.damage);
                stock.add(player2.life);
                stock.add(player2.initiative);

            }else {
                System.out.println("This mode doesn't exist");
            }

        }else {
            System.out.println("This feature doesn't exist");
        }
    }
}