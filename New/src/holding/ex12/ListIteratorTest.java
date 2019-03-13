package holding.ex12;
import java.util.*;
import static net.ffahey.util.Print.*;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            l1.add(i);
        ListIterator it = l1.listIterator(l1.size());
        while (it.hasPrevious()) {
             l2.add((Integer)it.previous());
        }
        print(l1);
        print(l2);
        print(l1.contains(-5));
        Collections.sort(l2);
        print(l2);
    }
}
