package P13;

public class DoorFactory {
    public static Door createDoor(VendorID vendorID) {
        Door door = null;

        switch (vendorID) {
            case LG :
                door = new LGDoor();
                break;
            case HYUNDAI :
                door = new HyudaiDoor();
                break;
            case SAMSUNG :
                door = new SamsungDoor();
                break;
        }
        return door;
    }
}
