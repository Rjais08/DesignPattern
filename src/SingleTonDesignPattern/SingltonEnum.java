package SingleTonDesignPattern;

public enum SingltonEnum {
    INSTANCE;

    public static SingltonEnum getInstance(){
        return INSTANCE;
    }

    public void showMessage(){
        System.out.println("Instance has been called");
    }
}
