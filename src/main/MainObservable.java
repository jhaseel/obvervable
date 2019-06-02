/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Controller;

/**
 *
 * @author jhaseel
 */
public class MainObservable {

    public static void main(String[] args) {
        Controller init = new Controller();
        init.generateChanges();
    }

}
