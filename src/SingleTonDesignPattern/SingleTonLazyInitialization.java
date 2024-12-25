package SingleTonDesignPattern;

public class SingleTonLazyInitialization {

    private static SingleTonLazyInitialization singleTonLazyInitialization;

    public SingleTonLazyInitialization(){

    }

    public static SingleTonLazyInitialization getInstance(){
        if(singleTonLazyInitialization == null){
            singleTonLazyInitialization =  new SingleTonLazyInitialization();
        }
        return singleTonLazyInitialization;
    }
}
