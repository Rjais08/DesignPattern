package WithStrategyPattern;

public class Vehicle {

    DriveStrategy strategy;

    public Vehicle(DriveStrategy strategy){
        this.strategy = strategy;
    }

    public void Drive(){
        strategy.Drive();
    }

}
