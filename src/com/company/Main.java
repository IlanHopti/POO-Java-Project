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
        System.out.println("Chose");
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
            Character player = new Character();
            player.caracteristics();
            System.out.println(player);
        }else {
            System.out.println("This feature doesn't exist");
        }
    }

}