package ducks.behavior.types_of_quacking;

public class QuackBehavior implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Regular quack");
    }
}
