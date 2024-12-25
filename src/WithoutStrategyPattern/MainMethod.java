package WithoutStrategyPattern;

import WithStrategyPattern.GoodsVehicle;
import WithStrategyPattern.OffRoadVehicle;
import WithStrategyPattern.PassengerVehicle;
import WithStrategyPattern.SportsVehicle;
import WithStrategyPattern.Vehicle;

public class MainMethod {

    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.Drive();
        vehicle = new GoodsVehicle();
        vehicle.Drive();
        vehicle = new SportsVehicle();
        vehicle.Drive();
        vehicle = new PassengerVehicle();
        vehicle.Drive();
    }
}
