/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

import designpattern.Command.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author tatsu
 */
public class DesignPattern {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        CommandPattern();
    }
    
    public static void CommandPattern(){
        InputHandler inputHandler = new InputHandler(new HelloCommand(), new ExitCommand(), new NullCommand(), new MorningCommand());
        while(true){
            Command cmd = inputHandler.HandleInput();
            cmd.Execute();
        }
    }
    
}
