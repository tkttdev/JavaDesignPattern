/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Command;

import javafx.application.Application;

/**
 *
 * @author tatsu
 */
public class ExitCommand extends Command{
    public void Execute(){
        System.out.println("exit");
        System.exit(0);
    }
}
