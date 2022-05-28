package ducks.algorithms.types_of_flying;

import ducks.strategies.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am high as a kite :D");
    }
}
