package appexperts.alberto.com.factorypatternexample.Shapes;

import android.util.Log;

import appexperts.alberto.com.factorypatternexample.Ishape.Shape;

/**
 * Created by alber on 24/02/2016.
 */
public class Rectangle  implements Shape
{
    @Override
    public String draw() {
        Log.i("Rectangle",  "Area of the Rectangle: is>>> " + 2*2+9*2);
       return "Area of the Rectangle: is>>> " + 2*2+9*2;
    }
}
