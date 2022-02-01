/**
 * Navpreet
 * 991655138
 */
package cardtrickice1;

import java.util.Random;
import java.util.Scanner;


public class CardtrickICE1 {

    
    public static void main(String[] args) 
    {
        //variables and objects
        Scanner scan = new Scanner(System.in);
        Random ranCard=new Random();
        Card[] magicHand = new Card[7]; //Array of object
        
        //display the hand
        System.out.println("The cards in the magic hand are:");
        
        //for statement to generate cards
        for(int i=0;i<magicHand.length;i++) 
        {
        Card c1=new Card();
        c1.setValue(ranCard.nextInt(13)+1); //use a methode to generate random method*13
        c1.setSuits(Card.SUITS[ranCard.nextInt(3)]); //random method
        magicHand[i]=c1;
        System.out.println(c1);       
        }
        
        //asking for the user a card
        System.out.print("Enter card value: ");
        int cardvalue= scan.nextInt();
        System.out.print("Enter suit: ");
        String suit = scan.next();
        
        //creating a new object
        Card cardTrick= new Card();
        cardTrick.setValue(cardvalue);
        cardTrick.setSuits(suit);
        
        //for statement to compare the objects
        boolean found = false;
        System.out.println("Searching for: " + cardTrick);
        
        for (int i = 0; i < magicHand.length; i++) 
        {  
            if ((magicHand[i].getValue() == cardTrick.getValue()) && magicHand[i].getSuits().equalsIgnoreCase(cardTrick.getSuits())) {
                System.out.println("Card is found in magic hand at index " + (i+1));
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Card is not found in magic hand.");
    }
}

        
        
    
    
    
    

