package starbuzz_coffee;

import starbuzz_coffee.topping_decorators.CaramelMacchiatoDecorator;
import starbuzz_coffee.topping_decorators.FlavorDecorator;
import starbuzz_coffee.topping_decorators.FrenchVanillaDecorator;
import starbuzz_coffee.topping_decorators.MochaDecorator;

public class StarbuzzCoffeProgram {
    FlavorDecorator flavorDecorator = new FlavorDecorator(new MochaDecorator(new FrenchVanillaDecorator(new CaramelMacchiatoDecorator(null)))) {
        @Override
        public String getDescription() {
            return null;
        }

        @Override
        public double getPrice() {
            return 0;
        }
    };
}
