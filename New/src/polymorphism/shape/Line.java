package polymorphism.shape;
import static net.ffahey.util.Print.*;

public class Line extends Shape {
    public void draw() { print("Line.draw()"); }
    public void erase() { print("Line.erase()"); }
    public void rotate() { print("Line.rotate()"); }
}
