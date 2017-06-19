/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Observer;

import java.util.*;
/**
 *
 * @author tatsu
 */
public class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    protected EventType et;
    protected void Notify(){
        for(Observer o : observers){
            o.OnNotify(et);
        }
    }
    
    public void AddObserver(Observer observer){
        observers.add(observer);
    }
    
    public void RemoveObserver(Observer observer){
        observers.remove(observer);
    }
}
