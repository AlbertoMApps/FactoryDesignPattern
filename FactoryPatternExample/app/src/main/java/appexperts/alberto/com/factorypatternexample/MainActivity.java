package appexperts.alberto.com.factorypatternexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import appexperts.alberto.com.factorypatternexample.Ishape.Shape;

public class MainActivity extends AppCompatActivity {

    private ShapeFactory sf;
    private TextView txtRectangle, txtCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtRectangle = (TextView) findViewById(R.id.rectangle);
        txtCircle = (TextView) findViewById(R.id.circle);

        sf = new ShapeFactory();
        //Rectangle
        Shape sh = sf.getShape("Rectangle");
        txtRectangle.setText(sh.draw());
        //Circle
        Shape sh2 = sf.getShape("Circle");
        txtCircle.setText(sh2.draw());
    }
}
