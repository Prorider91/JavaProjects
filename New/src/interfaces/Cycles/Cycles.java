package interfaces.Cycles;
import static net.ffahey.util.Print.*;

interface Cycle { void ride(); }
interface CycleFactory { Cycle getCycle(); }

class Unicycle implements Cycle {
    public void ride() { print("Riding Unicycle"); }
}

class Bicycle implements Cycle {
    public void ride() { print("Riding Bicycle"); }
}

class Tricycle implements Cycle {
    public void ride() { print("Riding Tricycle"); }
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() { return new Unicycle(); }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() { return new Bicycle(); }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() { return new Tricycle(); }
}

public class Cycles {
    public static void rideCycle(CycleFactory cycle) {
        Cycle c = cycle.getCycle();
        c.ride();
    }
    public static void main(String[] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
