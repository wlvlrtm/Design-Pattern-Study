package P11;


public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;


    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    protected void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        DoorStatus doorStatus = door.getDoorStatus();
        
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        if (doorStatus == DoorStatus.OPEND) {
            door.close();
        }

        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);
}
