package WithObserverPattern;

import WithObserverPattern.Observable.IphoneObservableImpl;
import WithObserverPattern.Observable.StocksObservable;
import WithObserverPattern.Observer.EmailAlertObserverImpl;
import WithObserverPattern.Observer.MobileNotificationImpl;
import WithObserverPattern.Observer.NotificationAlertObserver;

public class MainStore {

    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertObserverImpl("rahulvdjaiswal@gmail.com", iphoneStockObservable);
        NotificationAlertObserver notificationAlertObserver2 = new EmailAlertObserverImpl("rahuljai0852@gmail.com", iphoneStockObservable);
        NotificationAlertObserver notificationAlertObserver3 = new MobileNotificationImpl("+91-7992286835", iphoneStockObservable);

        iphoneStockObservable.add(notificationAlertObserver1);
        iphoneStockObservable.add(notificationAlertObserver2);
        iphoneStockObservable.add(notificationAlertObserver3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(100);

    }
}
