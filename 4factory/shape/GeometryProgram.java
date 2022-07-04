package shape;
/*
* Original example from the book does not really make sense. I used example from here:
* https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
* and the recruitment task from ATOS (get perimeter and area)
*
* */


import shape.factory.ShapeNameAndRandomParametersFactory;
import shape.product.Shape;

public class GeometryProgram {

    public static void main(String[] args) {
        Shape shape = new ShapeNameAndRandomParametersFactory().getShape("CIRCLE");
        System.out.println(shape.getShapeName());
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

        Shape shape1 = new ShapeNameAndRandomParametersFactory().getShape(null);
    }
}
