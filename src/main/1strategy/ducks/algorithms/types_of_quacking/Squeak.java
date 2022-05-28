package ducks.algorithms.types_of_quacking;

import ducks.strategies.IQuackBehavior;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeaaak");
    }
}
