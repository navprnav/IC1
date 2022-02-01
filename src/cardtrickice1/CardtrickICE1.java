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
        
        Scanner scan = new Scanner(System.in);
        Random randomCard=new Random();
        Card[] magicHand = new Card[7];
       
        for(int i=0;i<magicHand.length;i++) 
        {
        Card c1=new Card();
        c1.setValue(randomCard.nextInt(13)+1); 
        c1.setSuits(Card.SUITS[randomCard.nextInt(3)]); 
        magicHand[i]=c1;
        System.out.println(c1);       
        }
        
        
        System.out.print("Enter the value of Card: ");
        int valueofCard= scan.nextInt();
        System.out.print("Enter the Suit: ");
        String thesuit = scan.next();
        
        
        Card cardTrick= new Card();
        cardTrick.setValue(valueofCard);
        cardTrick.setSuits(thesuit);
        
       
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

        
        
    
    
    
    

