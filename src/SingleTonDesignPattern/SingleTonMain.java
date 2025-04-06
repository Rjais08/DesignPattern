package SingleTonDesignPattern;

public class SingleTonMain {

    public static void main(String[] args) {
        System.out.println();
        enumSinglton();
    }

    public static void getEagerInitialization(){
        SingleTonEagarInitialization singleTonEagarInitialization = SingleTonEagarInitialization.getInstance();
    }

    public static void enumSinglton(){
        SingltonEnum singltonEnum1 = SingltonEnum.INSTANCE;
        SingltonEnum singltonEnum2 = SingltonEnum.INSTANCE;
        SingltonEnum singletonEnum3 = SingltonEnum.getInstance();

        if(singltonEnum1 == singltonEnum2){
            System.out.println("Same instance");
        }
        if(singltonEnum1 == singletonEnum3){
            System.out.println("1 and 3 are also same");
        }
    }



}

class Singltonclass{

   private static Singltonclass singltonclass;

    private Singltonclass(){
    }

    public Singltonclass getInstance(){
        if(singltonclass == null){
            singltonclass = new Singltonclass();
        }
        return singltonclass;
    }
}
