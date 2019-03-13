package polymorphism.shape;
import static net.ffahey.util.Print.*;

public class Square extends Shape {
    @Override public void draw() { print("Square.draw()"); }
    @Override public void erase() { print("Square.erase()"); }
    @Override public void rotate() { print("Square.rotate()"); }
}
