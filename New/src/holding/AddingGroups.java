package holding;
import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = { 6, 7, 8, 9, 10 };
        collection.addAll(Arrays.asList(moreInts));
        List<Integer> list = Arrays.asList(moreInts);
        list.set(1, 99);
        moreInts[4] = 0;
        for (Integer i : list)
            System.out.print(i + ", ");
        System.out.println();
        for (Integer i : moreInts)
            System.out.print(i + ", ");
        System.out.println(list);
        System.out.println(collection);
    }
}
