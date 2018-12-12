/*
 * This is class called DoTasks
 * this class contains main method
 */
package assistant;

/**
 *
 *
 *
 * @author lucja
 *
 */
public class DoTasks {

    //create main method
    public static void main(String[] args) {

        // create objects
        PersonalAssistant p = new PersonalAssistant();
        
        PersonalAssistant y = new PersonalAssistant();

        PersonalAssistant o = new PersonalAssistant();

        PersonalAssistant d = new PersonalAssistant();
        
        PersonalAssistant f = new PersonalAssistant();
        
        p.canIBuyIt();

        y.checkDiscount();

        o.priceWithTax();
        
        d.checkMonthlyPayment();
        
        f.theEnd();
        
    } // close main method
    
} // close class