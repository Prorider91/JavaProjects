package polymorphism.shape;
import static net.ffahey.util.Print.*;

public class Triangle extends Shape {
    @Override public void draw() { print("Triangle.draw()"); }
    @Override public void erase() { print("Triangle.erase()"); }
    @Override public void rotate() { print("Triangle.rotate()"); }
}
