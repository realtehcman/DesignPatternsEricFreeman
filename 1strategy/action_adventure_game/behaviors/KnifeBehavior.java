package action_adventure_game.behaviors;

public class KnifeBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sharpy knife!");
    }
}
