package ducks.types;

import ducks.algorithms.types_of_flying.FlyWithWings;
import ducks.algorithms.types_of_quacking.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
