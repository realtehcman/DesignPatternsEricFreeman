package ducks.behavior.types_of_quacking;

public class SqueakBehavior implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeaaak");
    }
}
