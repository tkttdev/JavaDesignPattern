/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.FlyWeight;

/**
 *
 * @author tatsu
 */
public class LightObject {
    private static DataStore dataStore;
    static {
        dataStore = new DataStore();
    }
}
