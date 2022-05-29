package starbuzz_coffee;

import starbuzz_coffee.coffee_types.Coffee;
import starbuzz_coffee.coffee_types.Espresso;
import starbuzz_coffee.coffee_types.Latte;
import starbuzz_coffee.topping_decorators.CaramelMacchiatoDecorator;
import starbuzz_coffee.topping_decorators.FrenchVanillaDecorator;
import starbuzz_coffee.topping_decorators.MochaDecorator;

public class StarbuzzCoffeProgram {

    public static void main(String[] args) {
        Coffee espressoWithTopics = new CaramelMacchiatoDecorator(new CaramelMacchiatoDecorator(new MochaDecorator(new Espresso())));
        System.out.println(espressoWithTopics.getPrice());
        System.out.println("Espresso price is " + espressoWithTopics.getDescription());

        Coffee latte = new MochaDecorator(new FrenchVanillaDecorator(new Latte()));
        System.out.println(latte.getDescription());
        System.out.println("Latte price is " + latte.getPrice());
    }
}
