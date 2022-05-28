package ducks.algorithms.types_of_quacking;

import ducks.strategies.IQuackBehavior;

public class MuteIQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I cannot quack :(");
    }
}
