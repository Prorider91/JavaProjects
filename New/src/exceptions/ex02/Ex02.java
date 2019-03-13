package exceptions.ex02;

class Test {
    void f1() {}
}


public class Ex02 {

    public static void main(String[] args) {
       Test t = null;
       try {
           t.f1();
       } catch (NullPointerException ex1) { System.err.println("Catched!"); }
       System.out.println("end");
    }
}
