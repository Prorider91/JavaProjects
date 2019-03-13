package polymorphism.ex10;
import static net.ffahey.util.Print.*;

class Base {
    void f1() { print("Base.f1()"); }
    void f2() { f1(); print(" Base.f2()");
    }
}

class Class1 extends Base {
    void f2() { f1(); print(" Class1.f2()"); }
}

public class BaseClass {
    public static void main(String[] args) {
        Class1 c = new Class1();
        Base   b = c;
        b.f2();
    }
}
