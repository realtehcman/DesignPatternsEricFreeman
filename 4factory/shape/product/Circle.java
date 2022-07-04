package shape.product;

public class Circle implements Shape {
    private float perimeter;
    private float area;

    public Circle(float radius) {
        this.perimeter = (float) (2 * (Math.PI * radius));
        this.area = (float) (Math.PI * radius);
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
        return "Hi dude. im a CIRCLE!";
    }
}
