package polymorphism;
import static net.ffahey.util.Print.*;

class Shared {
    private int refcount = 0;
    private static int count = 0;
    private final int id = count++;
    public Shared() {
        print("Shared()" + this);
    }
    public void addRef() { refcount++; }
    protected void dispose() {
        if (--refcount == 0)
            print("Disposing" + this);
    }
    public String toString() { return ("Shared " + id); }
}

class Compousing {
    private Shared shared;
    private static  int counter = 0;
    private final int id = counter++;
    public Compousing(Shared shared) {
        print("Create " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        print("Disposing " + this);
        shared.dispose();
    }
    public String toString() { return ("Composing " + id); }
}

public class ReferenceCount {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Compousing[] composing = { new Compousing(shared), new Compousing(shared), new Compousing(shared),
            new Compousing(shared), new Compousing(shared) };
       for (Compousing c : composing)
           c.dispose();
    }
}
