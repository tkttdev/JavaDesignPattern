/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Command;

/**
 *
 * @author tatsu
 */
public class HelloCommand extends Command {
    public void Execute(){
        System.out.println("Hello!");
    }
}
