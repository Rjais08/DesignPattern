package WithObserverPattern.Observer;

import WithObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable stocksObservable;


    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable){
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product back in Stock hurryUp");
    }

    private void sendEmail(String emailId, String msg){
        System.out.println("Mail sent to :::" + emailId + "::: message :::" + msg);
    }
}
