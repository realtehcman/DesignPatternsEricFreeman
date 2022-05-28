package ducks.types;

import ducks.algorithms.types_of_flying.FlyWithWings;
import ducks.algorithms.types_of_quacking.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {

        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
