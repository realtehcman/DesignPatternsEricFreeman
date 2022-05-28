package ducks.client.types;

import ducks.behaviors.types_of_flying.NoFlyBehavior;
import ducks.behaviors.types_of_quacking.SqueakBehavior;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new NoFlyBehavior());
        setQuackBehavior(new SqueakBehavior());
    }

    @Override
    public void swim() {
        System.out.println("I am kinda swimming");
    }
}