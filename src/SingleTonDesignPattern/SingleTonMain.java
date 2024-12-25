package SingleTonDesignPattern;

public class SingleTonMain {

    public static void main(String[] args) {
        System.out.println();
    }

    public static void getEagerInitialization(){
        SingleTonEagarInitialization singleTonEagarInitialization = SingleTonEagarInitialization.getInstance();
    }


}
