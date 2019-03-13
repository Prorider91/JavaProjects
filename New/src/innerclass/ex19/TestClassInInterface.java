package innerclass.ex19;

interface Inter {
    class Run {
        public static void foo(Inter i) {
            i.f1();
            i.f2();
        }
    }
    void f1();
    void f2();
}

class Imp implements Inter {
    public void f1() { System.out.println("Imp.f1()");}
    public void f2() { System.out.println("Imp.f2()");}
}

public class TestClassInInterface {
}
