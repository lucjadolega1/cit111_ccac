/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingproject;

/**
 *
 * @author lucja
 */
public class JavaFirstProject {
    public static void main(String[] args){
        System.out.println("Should I buy a new car?");
        // Main question
        int response1 = 20;
        // value of response 1
        int compScore = 0;
        // compatability score: based on the user's response to questions 
        System.out.println("Do I have enough money? ( 0 = no, 20 = yes)" );
        //Question 1 
        if(response1 == 20){
            compScore = compScore + 20;
            System.out.println("Yay, good news");
        } else { 
            System.out.println("I hope you choose white car");
        } // close if/else block
        int response2 = 0;
        // value of response 2
        System.out.println("Do I really need a new car? ( 0 = no, 20 = yes)" );
        // Question 2 
        if(response2 == 0){
            compScore = compScore + 0;
            System.out.println("Heh, maybe you're right");
        } else {
            System.out.println("You have to think about it");
        } // close if/else block
        int response3 = 20;
        // value of response 3
        System.out.println("Am I gonna enjoy it? ( 0 = no, 20 = yes)" );
        // Question 3
        if(response3 == 20){
            compScore = compScore + 20;
            System.out.println("I think so");
        } else {
            System.out.println("It is your decision");
        } // close if/else block
        
        if(compScore > 30 ){
            System.out.println("Good news, you should buy a new car");
        } else {
            System.out.println("You should not buy a new car");
        // final score 
        } // close if/else blocks
    } // close main
} // close class
