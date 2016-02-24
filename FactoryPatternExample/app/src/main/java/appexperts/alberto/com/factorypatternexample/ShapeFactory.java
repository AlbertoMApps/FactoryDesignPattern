package appexperts.alberto.com.factorypatternexample;

import appexperts.alberto.com.factorypatternexample.Ishape.Shape;
import appexperts.alberto.com.factorypatternexample.Shapes.Circle;
import appexperts.alberto.com.factorypatternexample.Shapes.Rectangle;

/**
 * Created by alber on 24/02/2016.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }

}
