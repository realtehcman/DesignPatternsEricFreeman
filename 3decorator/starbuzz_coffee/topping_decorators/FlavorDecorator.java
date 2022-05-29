package starbuzz_coffee.topping_decorators;

import starbuzz_coffee.Coffee;

public abstract class FlavorDecorator extends Coffee {
    private Coffee coffee;

    protected FlavorDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

}
