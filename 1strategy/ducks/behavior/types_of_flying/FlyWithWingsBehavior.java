package ducks.behavior.types_of_flying;

public class FlyWithWingsBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am high as a kite :D");
    }
}
