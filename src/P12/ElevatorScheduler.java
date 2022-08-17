package P12;

import P11.Direction;

public interface ElevatorScheduler {
    public int selectedElevator(ElevatorManager manager, int destination, Direction direction);
}
