package SingleTonDesignPattern;

public class BillPughBestWayOfCreatingSingleton {

     private BillPughBestWayOfCreatingSingleton(){}

    private static class BillPughHelper{
         private static final BillPughBestWayOfCreatingSingleton INSTANCE = new BillPughBestWayOfCreatingSingleton();
    }

    public static BillPughBestWayOfCreatingSingleton getInstance(){
        return  BillPughHelper.INSTANCE;
    }
}
