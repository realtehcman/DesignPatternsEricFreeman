package ducks;
/*
* The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it
* */

import ducks.algorithms.types_of_flying.FlyWithWingsBehavior;
import ducks.client.types.DecoyDuck;

public class Duck {
    public static void main(String[] args) {
        ducks.client.types.Duck decoyDuck = new DecoyDuck();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.swim();
        decoyDuck.setFlyBehavior(new FlyWithWingsBehavior());
        decoyDuck.performFly();
    }
}
