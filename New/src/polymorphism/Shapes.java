package polymorphism;
import polymorphism.shape.*;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[28];
        for (int i = 0; i < 28; i++)
            s[i] = gen.next();
        for (Shape shp : s)
            shp.rotate();
    }
}
