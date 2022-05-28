package ducks.client.types;

import ducks.algorithms.types_of_flying.NoFlyBehavior;
import ducks.algorithms.types_of_quacking.MuteQuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new NoFlyBehavior());
        setQuackBehavior(new MuteQuackBehavior());
    }

    @Override
    public void swim() {
        System.out.println("I am kinda swimming");
    }
}
