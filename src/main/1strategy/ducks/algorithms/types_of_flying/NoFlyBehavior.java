package ducks.algorithms.types_of_flying;

import ducks.strategies.IFlyBehavior;

public class NoFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly :(");
    }
}
