
package cardtrickice1;

public class Card {
          private int value;
          private String suits; 
 public static final String [] SUITS = {"Diamonds","Clubs","Spades","Hearts"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }                  

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
   public String toString()
   {
  //  return Card{"suit=" + suit +" value=" + value + };
   return suits+" "+value;
   }

    }
 

