package starbuzz_coffee.topping_decorators;

import starbuzz_coffee.ICoffee;

public class MochaDecorator extends FlavorDecorator{
    public MochaDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Mocha";
    }

    @Override
    public double getPrice() {
        return 0.3;
    }
}
