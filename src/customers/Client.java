/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customers;

import model.Observer;
import services.Service;

/**
 *
 * @author jhaseel
 */
public class Client implements Observer {

    private Service observer;

    public Client() {
        // call instance to service
        observer = observer.getServiceInstance();
        // subscribe to observer
        this.Subscribe();
    }

    @Override
    public void update() {
        System.out.println("new update");
    }

    public void Subscribe() {
        this.observer.registerObserver(this);
    }

    public void unsubscribe() {
        this.observer.removeObseerver(this);
    }
}
