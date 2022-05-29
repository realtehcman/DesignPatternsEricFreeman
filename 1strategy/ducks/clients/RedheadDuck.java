package ducks.clients;

import ducks.behavior.types_of_flying.FlyWithWingsBehavior;
import ducks.behavior.types_of_quacking.QuackBehavior;

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
