package interfaces.music5;
import static net.ffahey.util.Print.*;


enum Note {
    MIDDLE_C, C_SHARP, FLAT_B;
}

interface Playable {
    void play(Note n);
}

interface Instrument {
    int VALUE = 5;
    void adjust();
}

abstract class Set implements Playable, Instrument {
    public abstract void play(Note n);
    public abstract String toString();
    public abstract void adjust();
}

class Wind extends Set {
    public void play(Note n) { print(this + ".play() " + n); }
    public String toString() { return "Wind"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Percussion extends Set {
    public void play(Note n) { print(this + ".play() " + n); }
    public String toString() { return "Percussion"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Stringed extends Set {
    public void play(Note n) { print(this + ".play() " + n); }
    public String toString() { return "Stringed"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Brass extends Wind {
    public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
    public String toString() { return "Woodwind"; }
}

public class Music5 {
    static void tune(Set i) {
        //...
        i.play(Note.MIDDLE_C);
    }
    static void tuneALL(Set[] e) {
        for (Set i : e)
            tune(i);
    }
    public static void main(String[] args) {
        Set[] orc = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneALL(orc);
    }
}
