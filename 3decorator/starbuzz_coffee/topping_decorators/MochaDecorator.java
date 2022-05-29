package starbuzz_coffee.topping_decorators;

import starbuzz_coffee.coffee_types.Coffee;

public class MochaDecorator extends FlavorDecorator{
    public MochaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.initialCoffee.getDescription() + " Mocha added ";
    }

    //recursive method chaining
    @Override
    public double getPrice() {
        return  super.initialCoffee.getPrice() + 0.3;
    }
}
