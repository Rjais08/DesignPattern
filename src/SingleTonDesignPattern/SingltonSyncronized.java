package SingleTonDesignPattern;

public class SingltonSyncronized {

    public static SingltonSyncronized singltonSyncronized;

    public SingltonSyncronized(){

    }

    synchronized public static SingltonSyncronized getInstance(){
        if(singltonSyncronized == null){
            singltonSyncronized = new SingltonSyncronized();
        }
        return singltonSyncronized;
    }
}
