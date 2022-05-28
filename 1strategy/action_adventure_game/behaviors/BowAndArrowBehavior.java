package action_adventure_game.behaviors;

public class BowAndArrowBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Long-raging bow");
    }
}
