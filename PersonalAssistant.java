/*
 * This is personal assistant that helps you with shopping expenses
 * This checks: 
 * option 1 : check if you can buy something basing on your credit card limit and balance
 * option 2 : check sale price with discount
 * option 3 : check sale price with tax 
 * option 4 : check monthly payment ( when you pay of item in 1 year)
 */
package assistant;

import java.util.Scanner;

/**
 *
 *
 *
 * @author lucja
 *
 */
public class PersonalAssistant {

    public void canIBuyIt() {

        // check: if you can buy item basing on your balance and card limit
        // integer presents limit on credit card
        int cardLimit;

        // int for current balance on credit card 
        double currentBalance;

        // int presents price of item 
        double itemPrice;

        // int for money you can spend after checking credit card limit and balance
        double moneyLeft;

        System.out.println("It is a beautiful day for shopping today");
        
        System.out.println();

        printStatement();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println();

        System.out.println("OPTION 1");

        System.out.println("***I will help you to check if you can buy any \n item basing on your credit card limit***");

        // create scanner object 
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println();
        
        System.out.println("What is your credit card limit? Enter amount: ");

        cardLimit = userInputScanner.nextInt();

        System.out.println("Now enter current balance: ");

        currentBalance = userInputScanner.nextDouble();

        // check how much money you can spend for shopping 
        moneyLeft = cardLimit - currentBalance;

        System.out.println("You have " + moneyLeft);

        System.out.println("Let's see if you can buy this item");

        System.out.println("Enter item price: ");

        itemPrice = userInputScanner.nextDouble();

        // check if you can buy item basing on money you have left on credit card
        if (itemPrice > moneyLeft) {

            System.out.println("You can not buy it");

            System.out.println();

            System.out.println(" $$$$$             $$$$");

            System.out.println(" $   $             $  $ ");

            System.out.println(" $$$$              $$$$");

            System.out.println("                        ");

            System.out.println("            $ ");

            System.out.println("      $           $");

            System.out.println("   $                $");

            System.out.println(" $                     $");

            System.out.println("                         ");


        } else {

            System.out.println("You can buy it, YAY");

            System.out.println();

            System.out.println(" $$$$$             $$$$");

            System.out.println(" $   $             $  $ ");

            System.out.println(" $$$$              $$$$");

            System.out.println("                        ");

            System.out.println(" $                     $");

            System.out.println("   $               $");

            System.out.println("      $         $");

            System.out.println("          $ ");

            System.out.println();
            
        } // close else 

    } // close method 

    public static void printStatement() {
        
        System.out.println("Isn't it?");
        
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        System.out.println("      I am your personal assistant      ");
        
    } // close method 

    // new method that can check price with discount  
    public void checkDiscount() {

        // original price of item
        double originalPrice;

        // rate: %off
        double rate;

        // discount: shows the discount
        double discount;

        // sale price after discount
        double salePrice;

        System.out.println();
        
        System.out.println("OPTION 2 \n***Let's check the discount and sale price of your item***");
        
        System.out.println();
        
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Please enter original price and press enter");

        originalPrice = userInputScanner.nextDouble();

        System.out.println("Now, enter the discount (% off) ");

        rate = userInputScanner.nextDouble();

        // check how much is the discount 
        discount = (rate / 100) * originalPrice;

        System.out.println("Awesome, your discount is: " + discount);
        // check the sale price with discount 

        salePrice = originalPrice - discount;

        System.out.println("And finally, your sale price is: " + salePrice);

    } // close method 

    // new method 
    public void priceWithTax() {

        // create variables 
        // 0.06 is sales tax 
        double sTax = 0.06;

        //price of item
        double price;

        // price with tax
        double PRICE_WITH_TAX;

        // create Scanner object to get user's imput
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println();
        
        // option 3 check your sale price with tax. You can put the price that was check above with discount 
        // or you can just enter other price (which for example is not with discount)
        System.out.println("OPTION 3");

        System.out.println("***I can check your sale price with tax***");
        
        System.out.println();

        System.out.println("Enter sale price and press enter");

        price = userInputScanner.nextDouble();

        // check the price with 6 % tax
        PRICE_WITH_TAX = price * (1 + sTax);

        // print out the price 
        System.out.println("Your item price + 6% tax is: " + PRICE_WITH_TAX + "$");

        System.out.println("*************************************");

    } // close method
    
    // new method check the 1 year monthly payment without intrest 
    public void checkMonthlyPayment(){
        
        // price of item
        double price;
        
        // every month payment(for 1 year)
        double monthlyPayment;
        
        //create scanner
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println();
        
        System.out.println("OPTION 4");
        
        System.out.println("***I will check your monthly payment for item \n you decide to pay off in 1 year***");
        
        System.out.println();
        
        System.out.println("Please enter item price and press enter");
        
        price = userInputScanner.nextDouble();
        
        // count monthly payment 
        monthlyPayment = price / 12;
        
        System.out.println("Your monthly payment is: " + monthlyPayment + "$");
        
    } // close method 
    
    public void theEnd (){
        
        System.out.println();
        
        System.out.println("Thank you for choosing your Personal Assistant");
        
        System.out.println("I hope you enjoy using the app");
        
        System.out.println("Have a good day");
        
    } // close method 

} // close class