package interfaces.newinter;

interface   Inter {
    void    f1();
    void    f2();
    void    f3();
}

class       NewInter implements Inter {
    public void f1() { System.out.println("NewInter.f1()");}
    public void f2() { System.out.println("NewInter.f2()");}
    public void f3() { System.out.println("NewInter.f3()");}
}

public class TestInter {
}
