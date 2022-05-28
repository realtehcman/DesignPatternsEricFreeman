package action_adventure_game.client.characters;

import action_adventure_game.behaviors.AxeBehavior;

public class Troll extends Character{
    public Troll() {
        setWeaponBehavior(new AxeBehavior());
    }

    @Override
    public void fight() {
        System.out.println("From the mud to the throne");
    }
}
