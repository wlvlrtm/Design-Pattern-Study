package P12;

import java.util.Calendar;

enum SchedulingStrategyID { RESPONSE_TIME, THROUGHPUT, DYNAMIC }

public class ShedulerFactory {
    public static ElevatorScheduler getSheduler(SchedulingStrategyID strategyID) {
        ElevatorScheduler scheduler = null;

        switch(strategyID) {
            case RESPONSE_TIME :
                scheduler = new ResponseTimeScheduler();
                break;
            case THROUGHPUT :
                scheduler = new ThroughputScheduler();
                break;
            case DYNAMIC :
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                
                if (hour < 12) {
                    scheduler = new ResponseTimeScheduler();
                }
                else {
                    scheduler = new ThroughputScheduler();
                }
                break;
        }
        return scheduler;
    }
}
