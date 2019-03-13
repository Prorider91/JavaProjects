package interfaces;

import interfaces.interfaceprocessor.StringProcessor;

interface CanFight {
    void    fight();
}

interface CanSwim {
    void    swim();
}

interface CanFly {
    void    fly();
}

interface CanClimb {
    void    climb();
}

class ActionCharacter {
    public void fight() {}
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {
    public void swim() {}
    public void fly() {}
    public void climb() {}
}
public class Adventure {
    public static void s(CanClimb x) {}
    public static void t(CanFight x) {}
    public static void u(CanSwim x) {}
    public static void v(CanFly x) {}
    public static void w(ActionCharacter x) {}
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        s(h);
        u(h);
        v(h);
        w(h);
    }
}
