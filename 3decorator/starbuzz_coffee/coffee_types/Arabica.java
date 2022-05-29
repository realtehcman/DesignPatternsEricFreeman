package starbuzz_coffee.coffee_types;

public class Arabica extends Coffee {
    @Override
    public double getPrice() {
        return 1.8;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Arabica ";
    }
}
