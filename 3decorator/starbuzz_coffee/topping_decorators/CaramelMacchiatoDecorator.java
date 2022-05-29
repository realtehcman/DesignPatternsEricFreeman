package starbuzz_coffee.topping_decorators;

import starbuzz_coffee.Coffee;

public class CaramelMacchiatoDecorator extends FlavorDecorator {
    public CaramelMacchiatoDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Caramel Macchiato. Steamed milk, espresso and caramel; what could be more enticing? ... ";
    }

    @Override
    public double getPrice() {
        return 1.3;
    }
}
