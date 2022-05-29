package starbuzz_coffee.topping_decorators;

import starbuzz_coffee.Coffee;

public class MochaDecorator extends FlavorDecorator{
    public MochaDecorator(Coffee coffee) {
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
