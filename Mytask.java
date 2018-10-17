/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.Scanner;

/**
 *
 * @author lucja.dolega
 */
public class Mytask {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        System.out.println("This test is important");
        printStatement();
        System.out.println("Remember to study");
        printStatement();
    } // close main method   
    public static void printStatement(){
        System.out.println("*******Final test is like 90% of your grade*****");
        System.out.println("Open the book and study");
        System.out.println("************************************************");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        generateTestScore();
    } // close printSta15tement method
    public static void generateTestScore(){
   int A;
    Scanner inputScanner = new Scanner(System.in);
   while(true){
       System.out.println("*****Your scores****");
    System.out.println("Enter your score ");
     A = inputScanner.nextInt();
             
        if(A >= 30){
            System.out.println("You would pass");
        } else if (A > 20) {
            System.out.println("There is possibility you could pass");
        } else {
            System.out.println("Keep studying");
        }
    } //close while loop 
} //close method

} //close class
         
                
        