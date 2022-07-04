package shape.factory;

import shape.product.Shape;

public interface Factory {
    Shape getShape(String shapeName);
}
