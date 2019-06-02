/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import customers.Client;
import services.Service;

/**
 *
 * @author jhaseel
 */
public class Controller {

    private Service observer;

    public Controller() {
        this.observer = this.observer.getServiceInstance();
        createCustomers();
    }

    public void notifyChanges() {
        // send any parameters to update
        this.observer.setMeasurements();
    }

    public void generateChanges() {
        // generate 10 events to update customes
        for (int x = 0; x < 10; x++) {
            this.notifyChanges();
        }
    }

    /**
     * create customers that automatically subscribe
     */
    public void createCustomers() {
        Client c = new Client();
        Client c1 = new Client();
    }
}
