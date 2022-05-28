package ducks.types;

import ducks.strategies.IQuackBehavior;
import ducks.strategies.IFlyBehavior;

public abstract class Duck {
    private IQuackBehavior quackBehavior;
    private IFlyBehavior flyBehavior;

    public abstract void swim();

    public void display() {
        System.out.println("I am a duck! Look at me");
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }
}
