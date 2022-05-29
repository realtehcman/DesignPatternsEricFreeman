package starbuzz_coffee;

import starbuzz_coffee.coffee_types.Espresso;
import starbuzz_coffee.topping_decorators.CaramelMacchiatoDecorator;
import starbuzz_coffee.topping_decorators.FlavorDecorator;
import starbuzz_coffee.topping_decorators.FrenchVanillaDecorator;
import starbuzz_coffee.topping_decorators.MochaDecorator;

public class StarbuzzCoffeProgram {

    public static void main(String[] args) {
        FlavorDecorator espressoWithTopics = new CaramelMacchiatoDecorator(new CaramelMacchiatoDecorator(new MochaDecorator(new Espresso())));
//        System.out.println(espressoWithTopics.getPrice());
    }
}
