package com.company;

public class Fight {

    void damage(Character player, Character player2) {
        player.life = player.life - player2.damage;
        System.out.println(player.life);
    }
}
