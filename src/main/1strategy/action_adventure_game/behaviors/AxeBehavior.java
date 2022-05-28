package action_adventure_game.behaviors;

import action_adventure_game.behaviors.IWeaponBehavior;

public class AxeBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Chopping axe");
    }
}
