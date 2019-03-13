package interfaces;

abstract class AbsClass {
    AbsClass() {
        print();
    }
    public abstract void print();
}

class NewClass extends AbsClass {
    private int i = 5;
    public void print() { System.out.println("NewClass.print()" + i); }
}

public class Abstract {
    public static void main(String[] args) {
        NewClass c = new NewClass();
        c.print();
    }
}
