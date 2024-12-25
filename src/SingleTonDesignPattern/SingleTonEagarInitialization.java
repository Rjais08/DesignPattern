package SingleTonDesignPattern;

public class SingleTonEagarInitialization {

        private static SingleTonEagarInitialization singleTonEagarInitialization = new SingleTonEagarInitialization();


    public SingleTonEagarInitialization(){

        }

        public static SingleTonEagarInitialization getInstance(){
        return singleTonEagarInitialization;
        }
}
