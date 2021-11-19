package com.company;

public class Fight {

    void damage(Character player, Character player2) {

        if (player.initiative > player2.initiative) {

            player2.takeDamages(player);
            player.takeDamages(player2);


        }else if (player2.initiative > player.initiative) {

            player.takeDamages(player2);
            player2.takeDamages(player);

        }else if (player2.initiative == player.initiative) {

            double number = Math.random();

            if(number >= 0.5) {
                player2.takeDamages(player);
                player.takeDamages(player2);
            }else {
                player.takeDamages(player2);
                player2.takeDamages(player);
            }
        }
    }
}

/*

 if (player.type == "Thief") {

                //Player dodge attack
                boolean val = new Random().nextInt(2)==0;
                if (val=true) {
                    player.life = player.life + player2.damage;
                    System.out.println("Player dodge attack");
                }

                //Player critical attack
                boolean val2 = new Random().nextInt(2)==0;
                if (val2=true) {
                    player.damage = player.damage + player.damage;
                }

                //Battle turn
                player2.life = player2.life - player.damage + player2.shield;
                player.life = player.life - player2.damage + player.shield;

                System.out.println(player2.name + " has " + player2.life + " pv and received " + player.damage + " damage");
                System.out.println(player.name + " has " + player.life + " pv and received " + player2.damage + " damage");

            }else if (player2.type == "Thief") {

                //Player2 dodge attack
                boolean val = new Random().nextInt(2)==0;
                if (val=true) {
                    player2.life = player2.life + player.damage;
                }

                //Player2 critical attack
                boolean val2 = new Random().nextInt(2)==0;
                if (val2=true) {
                    player2.damage = player2.damage + player2.damage;
                }

                //Battle turn
                player2.life = player2.life - player.damage + player2.shield;
                player.life = player.life - player2.damage + player.shield;

                System.out.println(player2.name + " has " + player2.life + " pv and received " + player.damage + " damage");
                System.out.println(player.name + " has " + player.life + " pv and received " + player2.damage + " damage");

            }else if (player.type == "Thief" && player2.type == "Thief") {

                //Player dodge attack
                boolean val = new Random().nextInt(2)==0;
                if (val=true) {
                    player.life = player.life + player2.damage;
                }

                //Player critical attack
                boolean val2 = new Random().nextInt(2)==0;
                if(val2=true){
                    player.damage = player.damage + player.damage;
                }

                //Player2 dodge attack
                boolean val3 = new Random().nextInt(2)==0;
                if(val3=true){
                    player2.life = player2.life + player.damage;
                }

                //Player2 critical attack
                boolean val4 = new Random().nextInt(2)==0;
                if(val4=true){
                    player2.damage = player2.damage + player2.damage;
                }

                //Battle turn
                player2.life = player2.life - player.damage + player2.shield;
                player.life = player.life - player2.damage + player.shield;

                System.out.println(player2.name + " has " + player2.life + " pv and received " + player.damage + " damage");
                System.out.println(player.name + " has " + player.life + " pv and received " + player2.damage + " damage");

            }else {


                //Battle turn
                player2.life = player2.life - player.damage + player2.shield - player.spell;
                player.life = player.life - player2.damage + player.shield - player2.spell;

                System.out.println(player2.name + " has " + player2.life + " pv and received " + (player.damage+player.spell) + " damage");
                System.out.println(player.name + " has " + player.life + " pv and received " + (player2.damage+player2.spell) + " damage");
            */