package starbuzz_coffee.topping_decorators;

import starbuzz_coffee.coffee_types.Coffee;

public class CaramelMacchiatoDecorator extends FlavorDecorator {
    public CaramelMacchiatoDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.initialCoffee.getDescription() + " Caramel Macchiato. Steamed milk, espresso and caramel added ";
    }

    //recursive method chaining
    @Override
    public double getPrice() {
        return super.initialCoffee.getPrice() + 1.3;
    }
}
