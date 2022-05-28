package action_adventure_game.client.characters;

import action_adventure_game.behaviors.SwordBehavior;

public class Knight extends Character{
    public Knight() {
        setWeaponBehavior(new SwordBehavior());
    }

    @Override
    public void fight() {
        System.out.println("I will kill for my princess");
    }
}
