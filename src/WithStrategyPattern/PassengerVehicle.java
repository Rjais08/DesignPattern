package WithStrategyPattern;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
