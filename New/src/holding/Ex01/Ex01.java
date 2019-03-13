package holding.Ex01;
import java.util.*;

class Gerbil {
    private int gerbilNumber;
    public Gerbil() {
       gerbilNumber = 1;
    }
    public void hop() {
        System.out.println("Gebril " + gerbilNumber);
    }
}

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Gerbil> g = new ArrayList<Gerbil>();
        for (int i = 0; i < 5; i++)
            g.add(new Gerbil());
        for (int i = 0; i < g.size(); i++)
            g.get(i).hop();
    }
}
