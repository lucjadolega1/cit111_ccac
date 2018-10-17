/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprint;

/**
 *
 * @author lucja
 */
public class Printstatement {
    public static void main(String[] args){
        System.out.println("This is my java class and I like it");
        //call the printStaement method
        printStatement();
        System.out.println("My classes are every Wednesday");
        // call the printStatement again
        printStatement();
    } // close main method
    // printStatement method
    public static void printStatement(){
        System.out.println("************What time are my classes ?***********");
        System.out.println("Time: 6:00 PM");
        System.out.println("*************************************************");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    } // close printStatement method
} // close class
