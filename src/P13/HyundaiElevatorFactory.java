package P13;

public class HyundaiElevatorFactory extends ElevatorFactory {
    public Motor createMotor() {
        return new HyudaiDoor();
    }

    public Door createDoor() {
        return new HyudaiDoor();
    }
}
