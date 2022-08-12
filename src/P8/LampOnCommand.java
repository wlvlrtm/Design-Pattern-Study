package P8;

public class LampOnCommand implements Command {
    private Lamp lamp;


    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    public void execute() {
        this.lamp.turnOn();
    }
}
