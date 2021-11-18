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

            System.out.println(" ");
            System.out.println("Chose your mode : ");
            System.out.println("1. Player VS AI");
            System.out.println("2. Player1 VS Player2");
            System.out.println(" ");
            System.out.println("Enter the correct number : ");

            Scanner condition2 = new Scanner(System.in);
            int number2 = condition2.nextInt();

            if (number2 == 1) {
                Warrior player = new Warrior();
                System.out.println(" ");
                System.out.println("Player 1 :");
                player.caracteristics();
                stock.add(player.name);
                stock.add(player.damage);
                stock.add(player.life);
                stock.add(player.initiative);
                player.tellMe();

                DefaultCharacter playerDefault = new DefaultCharacter();
                stock.add(playerDefault.nameDefault);
                stock.add(playerDefault.damageDefault);
                stock.add(playerDefault.lifeDefault);
                stock.add(playerDefault.initiativeDefault);

                System.out.println("Player 1 : "+ player);
                System.out.println("Player 2 :" + playerDefault);

            }else if (number2 == 2) {
                Fight test = new Fight();

                Character player = new Character();

                System.out.println("Chose your character");
                System.out.println("1 : Warrior");
                System.out.println("2 : Wizard");
                System.out.println("3 : Thief");

                Scanner choseCharacter = new Scanner(System.in);
                int answer = choseCharacter.nextInt();

                if (answer == 1) {
                    player = new Warrior();
//                    player.warriorCapacity();
                }else if (answer == 2) {
                    player = new Wizard();
                }else if (answer == 3) {
                    player = new Thief();
                }

                System.out.println(" ");
                System.out.println("Player 1 :");
                player.caracteristics();
                stock.add(player.name);
                stock.add(player.damage);
                stock.add(player.life);
                stock.add(player.initiative);
                player.tellMe();


                Character player2 = new Character();

                System.out.println("Chose your character");
                System.out.println("1 : Warrior");
                System.out.println("2 : Wizard");
                System.out.println("3 : Thief");

                Scanner choseCharacter2 = new Scanner(System.in);
                int answer2 = choseCharacter2.nextInt();

                if (answer2 == 1) {
                    player2 = new Warrior();
                }else if (answer2 == 2) {
                    player2 = new Wizard();
                }else if (answer2 == 3) {
                    player2 = new Thief();
                }
                System.out.println(" ");
                System.out.println("Player 2 :");
                player2.caracteristics();
                stock.add(player2.name);
                stock.add(player2.damage);
                stock.add(player2.life);
                stock.add(player2.initiative);
                player2.tellMe();

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
                        System.out.println("The winner is " + player2.name);
                    } else if (player2.life <= 0) {
                        turn = false;
                        System.out.println(" ");
                        System.out.println("The winner is " + player.name);
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
                System.out.println("This mode doesn't exist");
                tellMe();
                condition();
            }

        }else {
            System.out.println("This feature doesn't exist");
            tellMe();
            condition();
        }
    }
}