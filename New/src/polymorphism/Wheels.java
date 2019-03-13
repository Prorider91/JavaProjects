package polymorphism;

import polymorphism.whells.*;

public class Wheels {

    public static void main(String[] args) {
        Cycle c1 = new Unicycle();
        Cycle c2 = new Bicycle();
        Cycle c3 = new Tricycle();
        ((Unicycle) c1).balance();
        ((Bicycle) c2).balance();
        //! c3.balance(); Error!
    }
}
