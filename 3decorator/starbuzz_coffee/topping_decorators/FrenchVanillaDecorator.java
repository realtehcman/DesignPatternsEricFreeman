package starbuzz_coffee.topping_decorators;

import starbuzz_coffee.ICoffee;

public class FrenchVanillaDecorator extends FlavorDecorator{
    public FrenchVanillaDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "French Vanilla. As one of the world's most popular flavors, vanilla fits so perfectly with the bold flavor of coffee. ... ";
    }

    @Override
    public double getPrice() {
        return 0.75;
    }
}
