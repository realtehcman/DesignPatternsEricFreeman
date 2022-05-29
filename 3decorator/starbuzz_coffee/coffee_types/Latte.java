package starbuzz_coffee.coffee_types;

public class Latte extends Coffee {

    @Override
    public double getPrice() {
        return 1.45;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Latte ";
    }
}
