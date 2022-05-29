package starbuzz_coffee;

public class PlainCoffee implements ICoffee{
    private ICoffee coffee;

    public PlainCoffee(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
