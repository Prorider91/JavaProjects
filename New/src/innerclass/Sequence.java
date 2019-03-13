package innerclass;

interface Selector {
    boolean end();
    Object  current();
    void    next();
}

class Str {
    private String string = "String";
    public String toString() { return string; }
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if (next <= items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object   current() { return items[i]; }
        public void     next() { if (i < items.length) i++; }
        public Sequence getOuter() { return Sequence.this; }
    }
    private class ReverseSelector implements Selector {
        private int i = items.length - 1;
        public boolean end() { return i == -1; }
        public Object current() { return items[i]; }
        public void     next() { if (i != -1) i--; }
    }
    public Selector selector1() {
        return new SequenceSelector();
    }
    public Selector selector2() {
        return new ReverseSelector();
    }
    public static void  main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector2();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        Sequence seq2 = new Sequence(3);
        for (int i = 0; i < 3; i++)
            seq2.add(new Str());
        selector = seq2.selector2();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
