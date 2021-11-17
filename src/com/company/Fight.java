package com.company;

public class Fight {

    void damage(Character player, Character player2) {
        player.life = player.life - player2.damage;
        player2.life = player2.life - player.damage;
        System.out.println(player.life);
        System.out.println(player2.life);
    }
}
