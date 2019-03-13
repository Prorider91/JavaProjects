package innerclass.ex5;

class Outher {
    class Inner {}
}

public class ex5 {
    Outher o = new Outher();
    Outher.Inner i = o.new Inner();
}
