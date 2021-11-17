package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started");
        System.out.println(" ");

        Menu begin = new Menu();
        begin.tellMe();
        begin.condition();

    }
}

class Menu {

    void tellMe() {
        System.out.println("Chose");
        System.out.println("1. Quit");
        System.out.println("2. Continue");
        System.out.println("3. ...");
    }

    void condition() {
        System.out.println("Entrez le nombre en question : ");
        Scanner condition = new Scanner(System.in);
        int number = condition.nextInt();

        if(number == 1) {
            System.out.println("Le jeu s'arrête");
        }else if(number == 2) {
            System.out.println("Le jeu continue");
        }else {
            System.out.println("Cette fonctionnalité n'existe pas");
        }
    }

}

