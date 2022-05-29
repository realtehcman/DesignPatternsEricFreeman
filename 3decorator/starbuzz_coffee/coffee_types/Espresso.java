package starbuzz_coffee.coffee_types;

public class Espresso extends Coffee {
    @Override
    public double getPrice() {
        return 1.35;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Espresso ";
    }
}
