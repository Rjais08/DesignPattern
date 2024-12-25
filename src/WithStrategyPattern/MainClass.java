package WithStrategyPattern;

public class MainClass {

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
