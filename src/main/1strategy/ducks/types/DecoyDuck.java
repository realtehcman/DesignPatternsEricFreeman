package ducks.types;

import ducks.algorithms.types_of_flying.NoFly;
import ducks.algorithms.types_of_quacking.Squeak;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new NoFly());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void swim() {
        System.out.println("I am kinda swimming");
    }
}