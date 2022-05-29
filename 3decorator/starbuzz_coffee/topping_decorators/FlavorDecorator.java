package starbuzz_coffee.topping_decorators;

import starbuzz_coffee.coffee_types.Coffee;

public abstract class FlavorDecorator extends Coffee {
    Coffee initialCoffee;

    protected FlavorDecorator(Coffee coffee) {
        this.initialCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public abstract double getPrice();
}
