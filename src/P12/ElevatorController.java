package P12;

public class ElevatorController {
    private int id;
    private int curFloor;


    public ElevatorController(int id) {
        this.id = id;
        curFloor = 1;
    }

    public void gotoFloor(int destination) {
        System.out.println("Elevator: [" + id + "] Floor: " + curFloor);
        curFloor = destination;
        System.out.println(" ==> " + curFloor);
    }
}
