package com.company;

public class Fight {

    public void getDamage(Character player, Character player2) {

        if (player.initiative > player2.initiative) {

            player.takeDamage(player2);
            player2.takeDamage(player);

        } else if (player2.initiative > player.initiative) {

            player2.takeDamage(player);
            player.takeDamage(player2);

        } else if (player2.initiative == player.initiative) {

            double number = Math.random();

            if(number>=0.5){
                player.takeDamage(player2);
                player2.takeDamage(player);
            }else {
                player2.takeDamage(player);
                player.takeDamage(player2);
            }
        }
    }


}
