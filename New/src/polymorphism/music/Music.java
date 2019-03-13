package polymorphism.music;
import polymorphism.music.Note;
import static net.ffahey.util.Print.*;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

public class Music {
    public static void tune(Instrument i) {
        //...
        i.play(Note.MIDDLE_C);
    }
    public static void main (String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
