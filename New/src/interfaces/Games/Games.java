package interfaces.Games;
import static net.ffahey.util.Print.*;
import java.util.*;

interface Game { int drop(); void result(); }
interface GameFactory { Game getGame(); }

class RandInt {
    Random rand = new Random(47);
    int getRand(int i) {
        return (rand.nextInt(i));
    }
}

class Coin extends RandInt implements Game {
    private final int n = 2;
    public int drop() {
        return (getRand(n));
    }
    public void result() {
        if (drop() == 1)
            print("Egle");
        else
            print("NotEgle)");
    }
}

class CoinFactory implements GameFactory {
    public Game getGame() {
        return new Coin();
    }
}

class Bones extends RandInt implements Game {
    private final int n = 6;
    public int drop() {
        return (getRand(n));
    }
    public void result() {
        print("Bone shows " + drop());
    }
}

class BonesFactory implements GameFactory {
    public Game getGame() {
        return new Bones();
    }
}


public class Games {
    public static void playGame(GameFactory game) {
        Game g = game.getGame();
        g.result();
    }
    public static void  main(String[] args) {
        for (int i = 0; i < 5; i++) {
            playGame(new CoinFactory());
            playGame(new BonesFactory());
        }
    }
}
