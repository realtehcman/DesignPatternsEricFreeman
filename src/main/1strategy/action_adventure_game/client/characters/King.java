package action_adventure_game.client.characters;

import action_adventure_game.algorithms.SwordBehavior;

public class King extends Character{
    public King() {
        setWeaponBehavior(new SwordBehavior());
    }

    @Override
    public void fight() {
        System.out.println("King protects queen");
    }
}
