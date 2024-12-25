package WithStrategyPattern;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void Drive() {
        System.out.println("Normal Driving");
    }
}
