package exceptions.ex09;

class Exc1 extends Exception {}
class Exc2 extends Exception {}
class Exc3 extends Exception {}

class CallException {
    static int i = 1;
    public static void call() throws Exc1, Exc2, Exc3 {
        if (i == 1) {
            i++;
            throw new Exc1();
        }
        else if (i == 2) {
            i++;
            throw new Exc2();
        }
        else
            throw new Exc3();
    }
}

public class ex09 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                CallException.call();
            } catch (Exception e1) {
                System.err.println("Catched " + e1.getClass().getSimpleName());
            }
        }
    }
}
