package P11;

public class LGMotor extends Motor {
    public LGMotor(Door door) {
        super(door);
    }

    protected void moveMotor(Direction direction) {
        System.out.println("Motor Move");
    }




}
