package interfaces;

interface Base {
    void foo();
}

interface Inter1 extends Base {
    void f1();
}

interface Inter2 extends Base {
    void f2();
}

interface Inter3 extends Inter1, Inter2 {
    void f3();
}

class Class implements Inter3 {
    public void f3() { System.out.println("1");}
    public void f2() { System.out.println("2");}
    public void f1() { System.out.println("3");}
    public void foo() { System.out.println("0");}
}

public class Multi {
    public static void main(String[] args) {
        Class c = new Class();
        c.f1();
        c.f2();
        c.f3();
        c.foo();
    }
}
