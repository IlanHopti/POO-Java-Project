package com.company;

public class Fight {

    void damage(Character player, Character player2) {

        if (player.initiative > player2.initiative) {
            player2.life = player2.life - player.damage;
            player.life = player.life - player2.damage;

            System.out.println(player2.name + " has " + player2.life + " pv and received" + player.damage + " damage");
            System.out.println(player.name + " has " + player.life + " pv and received" + player2.damage + " damage");

        } else if (player2.initiative > player.initiative) {
            player.life = player.life - player2.damage;
            player2.life = player2.life - player.damage;

            System.out.println(player.name + " has " + player.life + " pv and received" + player.damage + " damage");
            System.out.println(player2.name + " has " + player2.life + " pv and received" + player2.damage + " damage");

        }
    }
}
