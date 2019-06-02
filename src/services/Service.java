/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import model.Observer;
import model.Subject;

/**
 *
 * @author jhaseel
 */
public class Service implements Subject {

    private ArrayList observers;

    // singleton observerService
    private static Service service = null;

    private Service() {
        observers = new ArrayList();
    }

    public static Service getServiceInstance() {
        if (service == null) {
            service = new Service();
        }
        return service;
    }
    // end singleton observerService

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("new customer subscribe");
    }

    @Override
    public void removeObseerver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            if (isUpdatable(i % 2)) {
                observer.update();
            }
        }
    }

    public void measurementsChanged() {
        System.out.println("new change ----->");
        notifyObservers();
    }

    /**
     * parameters changed in class
     */
    public void setMeasurements() {
        this.measurementsChanged();
    }

    /**
     * @param contidion: any parameter to validate update
     * @return boolean if the observer is updatable
     */
    public boolean isUpdatable(int contidion) {
        switch (contidion) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }
}
