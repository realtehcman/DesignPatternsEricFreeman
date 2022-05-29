package ducks.behavior.types_of_flying;

public class NoFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly :(");
    }
}
