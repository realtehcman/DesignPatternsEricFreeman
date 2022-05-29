package starbuzz_coffee.topping_decorators;

import starbuzz_coffee.coffee_types.Coffee;

public class FrenchVanillaDecorator extends FlavorDecorator{
    public FrenchVanillaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.initialCoffee.getDescription() + " French Vanilla. As one of the world's most popular flavors, vanilla fits so perfectly with the bold flavor of coffee. added ";
    }

    //recursive method chaining
    @Override
    public double getPrice() {
        return  super.initialCoffee.getPrice() + 0.25;
    }


}
