package P8;

public class AlarmOnCommand implements Command {
    private Alam alam;


    public AlarmOnCommand(Alam alam) {
        this.alam = alam;
    }

    public void execute() {
        this.alam.start();
    }
}
