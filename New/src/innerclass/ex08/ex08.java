package innerclass.ex08;

interface Inter {
    void f1();
}

class Outer {
    private class Inner implements Inter {
        public void f1() { System.out.println("f1()");}
    }
    public Inter getInter() {
        return new Inner();
    }
}

public class ex08 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Inter i = o.getInter();
        i.f1();

    }
}
