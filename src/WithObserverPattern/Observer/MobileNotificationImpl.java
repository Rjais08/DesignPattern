package WithObserverPattern.Observer;

import WithObserverPattern.Observable.StocksObservable;

public class MobileNotificationImpl implements NotificationAlertObserver {
    String mobileNum;
    StocksObservable stocksObservable;


    public MobileNotificationImpl(String mobileNum, StocksObservable stocksObservable){
        this.mobileNum = mobileNum;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMessage(mobileNum, "Product back in Stock hurryUp");
    }

    private void sendMessage(String mobileNum, String msg){
        System.out.println("Mobile message sent to :::" + mobileNum + "::: message ::: " + msg);
    }
}
