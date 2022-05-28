package action_adventure_game.behaviors;

public class SwordBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Swinging sword");
    }
}
