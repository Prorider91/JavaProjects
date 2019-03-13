package polymorphism.whells;
import static net.ffahey.util.Print.*;

public class Cycle {
    public int wheels() { return 0; }
    public void ride() { print("Cycle.ride(" + wheels() + ")"); }
}
