package shape.product;

public class Triangle implements Shape{
    private float area;
    private float perimeter;

    public Triangle(float height, float base, float side1, float side2) {
        this.perimeter = side1 + side2 + base;
        this.area = (height * base) / 2;
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
        return "triangle in da HOOD!";
    }
}
