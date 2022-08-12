package P11;

enum DoorStatus { 
    CLOSED,
    OPEND
}

enum MotorStatus {
    MOVING,
    STOPPED
}

public class Door {
    private DoorStatus doorStatus;

    public Door() {
        doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void close() {
        doorStatus = DoorStatus.CLOSED;
    }

    public void open() {
        doorStatus = DoorStatus.OPEND;
    }
}
