package ducks;
/*
* The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it
* */

import ducks.algorithms.types_of_flying.FlyWithWings;
import ducks.types.DecoyDuck;
import ducks.types.Duck;

public class Main {
    public static void main(String[] args) {
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.swim();
        decoyDuck.setFlyBehavior(new FlyWithWings());
        decoyDuck.performFly();
    }
}
