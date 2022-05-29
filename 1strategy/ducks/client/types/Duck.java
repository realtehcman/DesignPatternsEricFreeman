package ducks.client.types;

import ducks.behaviors.types_of_quacking.IQuackBehavior;
import ducks.behaviors.types_of_flying.IFlyBehavior;

public abstract class Duck {
    private IQuackBehavior quackBehavior;
    private IFlyBehavior flyBehavior;

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void swim();

    public void display() {
        System.out.println("I am a duck! Look at me");
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }
}
