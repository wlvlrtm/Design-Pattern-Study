package P12;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import P11.Direction;

public class ElevatorManager {
    private List<ElevatorController> controllers;
    

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<ElevatorController>(controllerCount);

        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }
    }

    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler;
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (hour < 12) {
            scheduler = new ResponseTimeScheduler();
        }
        else {
            scheduler = new ThroughputScheduler();
        }

        int selectedElevator = scheduler.selectedElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
