/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicswitch;

/**
 *
 * @author lucja
 */
public class Javatask {
    public static void main(String[] args){
        int CHOICE = 10;
        switch(CHOICE){
            case 1: 
                System.out.println("You made your first choice");
                break;
            case 2: 
                System.out.println("You made your second choice");
                break;
            case 10:
                System.out.println("Great choice");
                break;
            default: 
                System.out.println("Default case");
        } // close switching block
    } // close main method
} // close class
