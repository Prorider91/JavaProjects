package exceptions.ex01;

class MyException extends Exception {
    private String messege;
    MyException() {}
    MyException(String s) { messege = s; }
    public String toString() { return messege; }
}

public class Ex01 {
    public static void f1(int i) throws MyException {
        if (i < 10) {
            throw new MyException("Exception " + i);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                f1(i);
            } catch (MyException e1) { System.err.println(e1 + " catched!"); }
        }
    }
}
