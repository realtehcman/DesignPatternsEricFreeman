package action_adventure_game.algorithms;

import action_adventure_game.strategies.IWeaponBehavior;

public class SwordBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Swinging sword");
    }
}
