/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Command;

import java.awt.event.KeyEvent;
import java.util.Scanner;
import javax.swing.plaf.basic.BasicOptionPaneUI;

/**
 *
 * @author tatsu
 */
public class InputHandler {
    private Command buttonA;
    private Command buttonS;
    private Command buttonD;
    private Command buttonW;
    private Command nullCmd = new NullCommand();
    
    public InputHandler(Command buttonA, Command buttonS, Command buttonD, Command buttonW){
        this.buttonA = buttonA;
        this.buttonS = buttonS;
        this.buttonD = buttonD;
        this.buttonW = buttonW;
    }
    
    public Command HandleInput(){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(str.equals("a")){
            return buttonA;
        } else if(str.equals("s")){
            return buttonS;
        } else if(str.equals("d")){
            return buttonD;
        } else if(str.equals("w")){
            return buttonW;
        }
        System.out.println("null");
        return nullCmd;
    }
    
    
}
