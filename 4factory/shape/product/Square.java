package shape.product;

public class Square implements Shape {

    private float perimeter;
    private float area;

    public Square(float side) {
        this.perimeter = side * 4;
        this.area = side * area;
    }


    @Override
    public float getArea() {
        return this.area;
    }

    @Override
    public float getPerimeter() {
        return this.perimeter;
    }

    @Override
    public String getShapeName() {
        return "sup. i am SQUARE";
    }
}
