/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

import designpattern.Command.*;
import designpattern.FlyWeight.HevyObject;
import designpattern.FlyWeight.LightObject;
import java.awt.event.KeyEvent;

/**
 *
 * @author tatsu
 */
public class DesignPattern {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //CommandPattern();
        FlyWeightPattern();
    }
    
    public static void CommandPattern(){
        InputHandler inputHandler = new InputHandler(new HelloCommand(), new ExitCommand(), new NullCommand(), new MorningCommand());
        while(true){
            Command cmd = inputHandler.HandleInput();
            cmd.Execute();
        }
    }
    
    public static void FlyWeightPattern(){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            new HevyObject();
        }
        long hevyTime = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            new LightObject();
        }
        long lightTime = System.currentTimeMillis() - start;
        
        System.out.println("Not use FlyWeight Pattern : " + hevyTime);
        System.out.println("Use FlyWeight Pattern     : " + lightTime);
    }
    
}
