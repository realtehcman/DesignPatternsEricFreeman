package action_adventure_game.characters;

import action_adventure_game.strategies.IWeaponBehavior;

public abstract class Character {
    private IWeaponBehavior weaponBehavior;


    public void performWeaponBehavior() {
        this.weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(IWeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
