package com.company;

public class Fight {

    void damage(Character player, Character player2) {

        if (player.initiative > player2.initiative) {
            player2.life = player2.life - player.damage;
            player.life = player.life - player2.damage;
            System.out.println("Player 2 has " + player2.life + "pv and " + player.damage);
            System.out.println("Player 1 has " + player.life + "pv and " + player2.damage);
        } else if (player2.initiative > player.initiative) {
            player.life = player.life - player2.damage;
            player2.life = player2.life - player.damage;
            System.out.println("Player 1 has " + player.life + "pv and " + player.damage);
            System.out.println("Player 2 has " + player2.life + "pv and " + player2.damage);
        }
    }
}
