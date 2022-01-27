
package cardtrickice1;

public class Card {
  private int value;
          private String suits; 
          String[]Suits={"diamomnd","clubs","spades","hearts"};

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

    /**
     * @param Suits the Suits to set
     */
    public void setSuits(String[] Suits) {
        this.Suits = Suits;
    }
}
