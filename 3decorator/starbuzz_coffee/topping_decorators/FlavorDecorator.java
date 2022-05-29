package starbuzz_coffee.topping_decorators;

import starbuzz_coffee.ICoffee;

public abstract class FlavorDecorator implements ICoffee {
    private ICoffee coffee;

    protected FlavorDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

}
