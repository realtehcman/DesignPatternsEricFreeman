package ducks.behavior.types_of_quacking;

public class MuteQuackBehavior implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I cannot quack :(");
    }
}
