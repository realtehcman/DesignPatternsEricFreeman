package starbuzz_coffee.coffee_types;

public class DarkRoast extends Coffee {
    @Override
    public double getPrice() {
        return 2.10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " DarkRoast ";
    }
}
