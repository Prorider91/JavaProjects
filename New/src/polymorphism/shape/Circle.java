package polymorphism.shape;
import static net.ffahey.util.Print.*;

public class Circle extends Shape {
   @Override public void draw() { print("Circle.draw()"); }
   @Override public void erase() { print("Circle.erase()"); }
   @Override public void rotate() { print("Circle.rotate()"); }
}
