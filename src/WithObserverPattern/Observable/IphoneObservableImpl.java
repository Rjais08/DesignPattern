package WithObserverPattern.Observable;

import WithObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    public List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
            notificationAlertObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {

        for(NotificationAlertObserver notificationAlertObserver : notificationAlertObserverList){
            notificationAlertObserver.update();
        }

    }



    public void setStockCount(int newStockAdded) {
    if(stockCount == 0 && newStockAdded != 0){
        notifySubscribers();
    }
    stockCount = stockCount + newStockAdded;

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
