package ducks.client.types;

import ducks.algorithms.types_of_flying.FlyWithWingsBehavior;
import ducks.algorithms.types_of_quacking.QuackBehavior;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFlyBehavior(new FlyWithWingsBehavior());
        setQuackBehavior(new QuackBehavior());
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
