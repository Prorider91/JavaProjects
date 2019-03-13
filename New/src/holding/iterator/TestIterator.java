package holding.iterator;
import static net.ffahey.util.Print.*;
import java.util.*;

class Int {
    private int id;
    Int(int i) { id = i; }
    public int getid() { return id; }
    public String toString() { return ("" + id); }
}

public class TestIterator {
    public static void main(String[] args) {
        Collection<Int> list = new ArrayList<Int>();
        for (int i = 0; i < 10; i++)
            list.add(new Int(i));
        Iterator<Int> it = list.iterator();
        while (it.hasNext()) {
            Int i = it.next();
            if ((i.getid() % 2) == 0)
                printnb(i.getid() + ", ");
            else
                it.remove();
        }
        print(list);
        list.addAll(Arrays.asList(new Int(1), new Int(3), new Int(5), new Int(7), new Int(9)));
        print(list);
        ListIterator<Int> lit = ((ArrayList<Int>) list).listIterator();
        while (lit.hasNext()) {
            Int i = lit.next();
            if ((i.getid() % 2) == 0)
                lit.add(new Int(i.getid() + 1));
            else
                lit.set(new Int(i.getid() * -1));
        }
        print(list);
    }
}
