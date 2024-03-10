/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.observerpattern;

/**
 *
 * @author pc
 */
public class ObserverPattern {

    public static void main(String[] args) {
        Stock appleStock = new ConcreteStock("APP", 100);
        Stock dellStock = new ConcreteStock("DELL", 100);
        Investor tomInvestor = new SimpleInvestor("Tom");
        Investor bobInvestor = new SimpleInvestor("Bob");
        appleStock.addObserver(tomInvestor);
        appleStock.addObserver(bobInvestor);
        dellStock.addObserver(tomInvestor);
        
        appleStock.notifyInvestors(100);
        appleStock.notifyInvestors(40.0);
        appleStock.notifyInvestors(10.0);
        appleStock.notifyInvestors(5.0);
        appleStock.notifyInvestors(300.0);
        appleStock.notifyInvestors(200.0);
    }
}
