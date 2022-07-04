package shape.factory;

import shape.product.Circle;
import shape.product.Shape;
import shape.product.Square;
import shape.product.Triangle;

import java.util.Random;

public class ShapeNameAndRandomParametersFactory implements Factory{
    @Override
    public Shape getShape(String shapeName) {
        if ((shapeName == null) || (shapeName.equals(""))){
            throw new IllegalArgumentException("No String input passed");
        }
        else if (shapeName.equalsIgnoreCase("circle")){
            return new Circle(new Random().nextFloat());
        }
        else if (shapeName.equalsIgnoreCase("triangle")){
            return new Triangle(new Random().nextFloat(),new Random().nextFloat(), new Random().nextFloat(),
                    new Random().nextFloat());
        }
        else if (shapeName.equalsIgnoreCase("square")){
            return new Square(new Random().nextFloat());
        }
        return null;
    }
}
