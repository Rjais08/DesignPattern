public class StrategyDesigninJava {

    public static void main(String[] args) {
        Vehicle normalVehicle = new GoodsVehicle();
        normalVehicle.drive();
        normalVehicle.checkFuel();
        Vehicle goodsVehicle = new PassengerVehicle();
        goodsVehicle.drive();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
        offRoadVehicle.checkFuel();
    }
}

interface DriveStrategy{

    public void drive();
    public void checkFuel();
}

class NormalDriveStrategyClass implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("this is normal");
    }

    @Override
    public void checkFuel() {
        System.out.println("this is checkfuel for normal");
    }

}

class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("This is Sports");
    }

    @Override
    public void checkFuel() {
        System.out.println("this is checkfuel for sports");
    }
}

class Vehicle{
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

    public void checkFuel(){
        driveStrategy.checkFuel();
    }
}

class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new NormalDriveStrategyClass());
    }
}

class PassengerVehicle extends Vehicle{

    public PassengerVehicle() {
        super(new NormalDriveStrategyClass());
    }
}

class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}








