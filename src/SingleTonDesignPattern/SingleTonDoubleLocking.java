package SingleTonDesignPattern;

public class SingleTonDoubleLocking {

    private static volatile SingleTonDoubleLocking singleTonDoubleLocking;

    private SingleTonDoubleLocking(){

    }

    synchronized public static SingleTonDoubleLocking getInstance(){
        if(singleTonDoubleLocking == null){
            synchronized (SingleTonDoubleLocking.class){
                if(singleTonDoubleLocking == null){
                    singleTonDoubleLocking = new SingleTonDoubleLocking();
                }
            }
        }
        return singleTonDoubleLocking;
    }
}
