package interfaces.ex14;

interface Inter1 {
    void f11();
    void f12();
}

interface Inter2 {
    void f21();
    void f22();
}

interface Inter3 {
    void f31();
    void f32();
}

interface Inter12 extends Inter1, Inter2, Inter3 {
    void f121();
}

abstract class Class {
}

class Inter extends Class implements Inter12 {
    public void f121() {}
    public void f11() {}
    public void f12() {}
    public void f21() {}
    public void f22() {}
    public void f31() {}
    public void f32() {}
}

public class ex14 {
    public static void a(Inter1 i) {}
    public static void b(Inter2 i) {}
    public static void c(Inter3 i) {}
    public static void d(Inter12 i) {}
    public static void main(String[] args) {
        Inter x = new Inter();
        a(x);
        b(x);
        c(x);
        d(x);
    }
}
