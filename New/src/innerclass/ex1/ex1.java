package innerclass.ex1;

class Outer {
    private String name;
    Outer() { name = "noname"; }
    Outer(String s) { name = s; }
    class Inner {
        private int i = 1;
        public int val() { return i; }
        public String toString() { return name; }
    }
    public Inner getInner() { return new Inner(); }
}

public class ex1 {
    public static void main(String[] args) {
        Outer a = new Outer("Name1");
        Outer.Inner i = a.getInner();
        System.out.println(i);
    }
}
