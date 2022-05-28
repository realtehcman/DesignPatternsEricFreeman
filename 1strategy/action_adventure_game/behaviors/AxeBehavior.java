package action_adventure_game.behaviors;

public class AxeBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Chopping axe");
    }
}
