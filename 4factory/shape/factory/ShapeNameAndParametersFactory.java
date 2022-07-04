package shape.factory;

import shape.product.Circle;
import shape.product.Shape;
import shape.product.Square;
import shape.product.Triangle;

import java.util.Scanner;

public class ShapeNameAndParametersFactory implements  Factory{
    @Override
    public Shape getShape(String shapeName) {
        Scanner sc = new Scanner(System.in);
        if ((shapeName == null) || (shapeName.equals(""))){
            throw new IllegalArgumentException("No String input passed");
        }
        else if (shapeName.equalsIgnoreCase("circle")){
            System.out.println("Enter 1 parameters");
            return new Circle(sc.nextFloat());
        }
        else if (shapeName.equalsIgnoreCase("triangle")){
            System.out.println("Enter 4 parameters");
            return new Triangle(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }
        else if (shapeName.equalsIgnoreCase("square")){
            System.out.println("Enter 1 parameters");
            return new Square(sc.nextFloat());
        }
        return null;
    }
}
