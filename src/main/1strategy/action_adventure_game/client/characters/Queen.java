package action_adventure_game.client.characters;

import action_adventure_game.algorithms.KnifeBehavior;

public class Queen extends Character{
    public Queen() {
        setWeaponBehavior(new KnifeBehavior());
    }

    @Override
    public void fight() {
        System.out.println("Exiting kitchen to fight!");
    }
}
