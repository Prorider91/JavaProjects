package polymorphism;
import static net.ffahey.util.Print.*;

class Alert {
    public void signal() {}
}

class NoAlert extends Alert {
    public void signal() { print("No Alert"); }
}

class WarningAlert extends Alert {
    public void signal() { print("Warning"); }
}

class StopAlert extends Alert {
    public void signal() { print("Stop"); }
}

class AlertStatus {
    private Alert alert = new NoAlert();
    public void setWarning() { alert = new WarningAlert(); }
    public void setStop()   { alert = new StopAlert(); }
    public void sound() { alert.signal(); }
}

public class Spaceship {
    public static void main(String[] args) {
        AlertStatus status = new AlertStatus();
        status.sound();
        status.setWarning();
        status.sound();
        status.setStop();
        status.sound();
    }
}
