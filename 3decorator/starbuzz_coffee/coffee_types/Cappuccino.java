package starbuzz_coffee.coffee_types;

public class Cappuccino extends Coffee {
    @Override
    public double getPrice() {
        return 1.3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Cappuccino ";
    }
}
