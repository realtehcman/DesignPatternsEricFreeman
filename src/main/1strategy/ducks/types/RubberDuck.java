package ducks.types;

import ducks.algorithms.types_of_flying.NoFly;
import ducks.algorithms.types_of_quacking.MuteQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new NoFly());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void swim() {
        System.out.println("I am kinda swimming");
    }
}
