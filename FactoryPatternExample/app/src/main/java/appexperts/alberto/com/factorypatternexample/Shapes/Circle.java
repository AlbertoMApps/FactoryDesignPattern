package appexperts.alberto.com.factorypatternexample.Shapes;

import android.util.Log;

import appexperts.alberto.com.factorypatternexample.Ishape.Shape;

/**
 * Created by alber on 24/02/2016.
 */
public class Circle implements Shape {
    @Override
    public String draw() {
        Log.i("Circle",  "Area of the Circle: is>>> " + Math.PI*Math.sqrt(4));
        return "Area of the Circle: is>>> " + Math.PI*Math.sqrt(4);
    }
}
