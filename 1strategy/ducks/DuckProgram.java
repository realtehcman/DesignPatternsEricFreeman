package ducks;
/*
* The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it
* */

import ducks.behaviors.types_of_flying.FlyWithWingsBehavior;
import ducks.client.types.DecoyDuck;
import ducks.client.types.Duck;

public class DuckProgram {
    public static void main(String[] args) {

        //decoyDuck object from DecoyDuck class, restricts to methods from Duck interface
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.swim();
        decoyDuck.display();
        System.out.println("====");

        DecoyDuck decoyDuck2 = new DecoyDuck();
        decoyDuck2.performFly();
        decoyDuck2.performQuack();
        decoyDuck2.swim();
        decoyDuck2.display();
        //first duck cannot have method reveal
        decoyDuck2.reveal();

    }
}
