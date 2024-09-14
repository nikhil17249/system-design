package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailNotificationObserver;
import ObserverPattern.Observer.MobileAlertObserverImpl;

public class store {

    public static void main(String[] args) {
        StocksObservable iphoneObserverable = new IphoneObservableImpl();

        iphoneObserverable.add(new EmailNotificationObserver("xy@gmail.com", iphoneObserverable));
        iphoneObserverable.add(new MobileAlertObserverImpl("987", iphoneObserverable));

        iphoneObserverable.setStockCount(10);
    }
}
