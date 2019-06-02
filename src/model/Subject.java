/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jhaseel
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObseerver(Observer o);

    public void notifyObservers();
}
