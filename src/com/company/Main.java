package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Application has started");

        CharacterList save = new CharacterList();

        Menu begin = new Menu();
        begin.condition(save);
    }
}

class Menu {

    void condition(CharacterList save) {
        System.out.println(" ");
        System.out.println("Chose option : ");
        System.out.println("1. Display Character");
        System.out.println("2. Create Character");

        System.out.println(" ");
        System.out.println("Enter the correct number : ");

        //scanner of condition to stop or continue the game
        Scanner condition = new Scanner(System.in);
        int number = condition.nextInt();

        if(number == 1) {
            //Display character already existing
            System.out.println(" ");
            System.out.println("Display Character : ");

            //Set display character 1
            Character play1 = new Warrior();
            System.out.print("1 : ");
            play1.displayCharacter("Theo", 20, 100, 10, "Warrior");

            //Set display character 2
            Character play2 = new Wizard();
            System.out.print("2 : ");
            play2.displayCharacter("Ilan", 25, 110, 8, "Wizard");

            //Set display character 3
            Character play3 = new Thief();
            System.out.print("3 : ");
            play3.displayCharacter("Vahé", 15, 120, 11, "Thief");

            //Set display character 4
            Character play4 = new Classical();
            System.out.print("4 : ");
            play4.displayCharacter("Antony", 100, 150, 15, "Classical");

            //Set variable for display
            int y = 4;

            //Display new Characters
            for(int i = 0; i < save.getCharacters().size(); i++) {
                y++;
                System.out.print(y + " : ");
                System.out.println(save.getCharacters().get(i).toString());
            }

            System.out.println(" ");
            System.out.println("Chose your option :");
            System.out.println("1. Back to Menu");
            System.out.println("2. Quit");
            System.out.println(" ");
            System.out.println("Enter the correct number : ");

            Scanner option3 = new Scanner(System.in);
            int newOption = option3.nextInt();

            if(newOption == 1) {
                condition(save);
            }

        }else if(number == 2) {
            //Create a character
            System.out.println(" ");
            System.out.println("Create a Character : ");

            //Player 1
            Character player = new Character();

            //Character choice
            System.out.println(" ");
            System.out.println("Player 1 : ");
            System.out.println("Chose your option : ");
            System.out.println("1 : Default Character");
            System.out.println("2 : Create Character");

            System.out.println(" ");
            System.out.println("Enter the correct number : ");

            Scanner choseOption = new Scanner(System.in);
            int option = choseOption.nextInt();

            if (option == 1) {
                //Creation of a DefaultCharacter with informations already installed
                player = new DefaultCharacter();
                save.saveCharacter(player);

            } else if (option == 2) {
                //Creation of it's own character
                System.out.println(" ");
                System.out.println("Player 1 : ");
                System.out.println("Chose your character : ");
                System.out.println("1 : Warrior");
                System.out.println("2 : Wizard");
                System.out.println("3 : Thief");
                System.out.println("4 : Classical");

                System.out.println(" ");
                System.out.println("Enter the correct number : ");

                Scanner choseCharacter = new Scanner(System.in);
                int answer = choseCharacter.nextInt();

                if (answer == 1) {
                    //Select a Warrior class
                    player = new Warrior();
                    player.warriorCapacity();
                } else if (answer == 2) {
                    //Select a Wizard class
                    player = new Wizard();
                    player.wizardCapacity();
                } else if (answer == 3) {
                    //Select a Thief class
                    player = new Thief();
                } else if (answer == 4) {
                    //Select a Classical class
                    player = new Classical();
                } else {
                    System.out.println("This character doesn't exist");
                    //Come back to the Start
                    condition(save);
                }

                System.out.println(" ");
                System.out.println("Player 1 :");
                player.characteristics();
                save.saveCharacter(player);
                System.out.println(save.getCharacters().size());
                //stock.add(player);

            } else if (option == 666) {
                //Select the Easter Egg with information already installed
                player = new EasterEgg();
            }

            //Player 2
            Character player2 = new Character();

            //Character choice
            System.out.println(" ");
            System.out.println("Player 2 : ");
            System.out.println("Chose your option : ");
            System.out.println("1 : Default Character");
            System.out.println("2 : Create Character");

            System.out.println(" ");
            System.out.println("Enter the correct number : ");

            Scanner choseOption2 = new Scanner(System.in);
            int option2 = choseOption2.nextInt();

            if (option2 == 1) {
                //Creation of a DefaultCharacter with informations already installed
                player2 = new DefaultCharacter();
                save.saveCharacter(player2);

            } else if (option2 == 2) {

                //Creation of it's own character
                System.out.println(" ");
                System.out.println("Player 2 : ");
                System.out.println("Chose your character : ");
                System.out.println("1 : Warrior");
                System.out.println("2 : Wizard");
                System.out.println("3 : Thief");
                System.out.println("4 : Classical");

                System.out.println(" ");
                System.out.println("Enter the correct number : ");

                Scanner choseCharacter2 = new Scanner(System.in);
                int answer2 = choseCharacter2.nextInt();

                if (answer2 == 1) {
                    //Select a Warrior class
                    player2 = new Warrior();
                    player2.warriorCapacity();
                } else if (answer2 == 2) {
                    //Select a Wizard class
                    player2 = new Wizard();
                    player2.wizardCapacity();
                } else if (answer2 == 3) {
                    //Select a Thief class
                    player2 = new Thief();
                } else if (answer2 == 4) {
                    //Select a Classical class
                    player2 = new Classical();
                } else {
                    System.out.println("This character doesn't exist");
                    //Come back to the Start
                    condition(save);
                }
                System.out.println(" ");
                System.out.println("Player 2 :");
                player2.characteristics();
                save.saveCharacter(player2);
                //stock.add(player2);

            } else if (option2 == 666) {
                //Select the Easter Egg with information already installed
                player2 = new EasterEgg();
            }

            System.out.println("Player 1 : " + player);
            System.out.println("Player 2 : " + player2);

            System.out.println(" ");
            System.out.println("Chose option : ");
            System.out.println("1. Start a fight");
            System.out.println("2. Back to Menu");

            System.out.println(" ");
            System.out.println("Enter the correct number : ");

            //scanner of condition to stop or continue the game
            Scanner choix = new Scanner(System.in);
            int choice = choix.nextInt();

            if (choice == 1) {

                //Instantiate of class Fight
                Fight fight = new Fight();

                System.out.println(" ");
                System.out.println("Begin of the Fight");

                boolean turn = true;
                //Turns counter
                int counter = 1;

                while (turn) {
                    if (player.life <= 0 && player2.life <= 0) {
                        //If equality
                        turn = false;
                        System.out.println(" ");
                        System.out.println("It's perfect equality!");
                    } else if (player2.life <= 0) {
                        //If Player win
                        turn = false;
                        System.out.println(" ");
                        System.out.println("The winner is " + player.name + ", who is a " + player.type);
                    } else if (player.life <= 0) {
                        //If Player2 win
                        turn = false;
                        System.out.println(" ");
                        System.out.println("The winner is " + player2.name + ", who is a " + player2.type);
                    }else {
                        System.out.println(" ");
                        System.out.println("Turn n°" + counter + " :");

                        //function of the Fight
                        fight.damage(player, player2);
                    }
                    //Add a counter value for every turn
                    counter++;
                }

                System.out.println(" ");
                System.out.println("End of the Fight");

                System.out.println(" ");
                System.out.println("Chose your option : ");
                System.out.println("1 : Back to Menu");
                System.out.println("2 : Quit");

                System.out.println(" ");
                System.out.println("Enter the correct number : ");

                Scanner end = new Scanner(System.in);
                int endFight = end.nextInt();

                if(endFight == 1) {
                    condition(save);
                }

            }else if (choice == 2) {
                condition(save);
            }

        }else {
            System.out.println("This feature doesn't exist");
            //Come back to the Start
            condition(save);
        }
    }
}