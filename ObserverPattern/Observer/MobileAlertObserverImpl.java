package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String phoneNumber;
    StocksObservable observable;

    /***
     * Added a Constructor to avoid the multiple checks in update method implementation to which type of observable
     * object has been passed in case of multiple observable
     ***/
    public MobileAlertObserverImpl(String phoneNumber, StocksObservable observable){
        this.observable = observable;
        this.phoneNumber = phoneNumber;
    }




    @Override
    public void update() {
        sendmsg(phoneNumber, "product is in stock");
    }

    private void sendmsg(String phoneNumber, String productIsInStock) {
        //Dummy Method
        System.out.println("SEND MSG TO: " + phoneNumber );
    }
}
