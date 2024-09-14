package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailNotificationObserver implements  NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    /***
     * Added a Constructor to avoid the multiple checks in update method implementation to which type of observable
     * object has been passed in case of multiple observable
     ***/
    public EmailNotificationObserver(String emailId, StocksObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }




    @Override
    public void update() {
        sendMail(emailId, "product is in stock");
    }

    private void sendMail(String emailId, String productIsInStock) {
        //Dummy Method
        System.out.println("SEND MAIL TO: " + emailId );
    }
}
