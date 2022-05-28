package ducks;

import ducks.strategies.IQuackBehavior;
import ducks.strategies.IFlyBehavior;

public class Duck {
    private IQuackBehavior quackBehavior;
    private IFlyBehavior flyBehavior;

    public void swim() {
        System.out.println("Look, I am swimming!");
    }

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
