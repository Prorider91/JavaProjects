package innerclass.ex07;

interface Inter {
    void f1();
}

class Outher {
    public static Inter foo() {
       return new Inter() {
           public void f1() { System.out.println("Outher.foo()"); }
       };
    }
}

public class ex07 {
    public static void main(String[] args) {
        Inter i = Outher.foo();
        i.f1();
    }
}
