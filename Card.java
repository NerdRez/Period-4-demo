/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {
    private String suit;
    private String rank;
    private int pointValue;
    public Card(String cardRank, String cardSuit, int cardPointValue) {
        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;
    }
    
    public String suit() {
        return suit;
    }
    
    public String rank() {
        return rank;
    }

    public int pointValue() {
        return pointValue;
    }

    public boolean matches(Card otherCard) {
        if(this.suit.equals(otherCard.suit) && this.rank.equals(otherCard.rank) && this.pointValue == otherCard.pointValue)
        {
            return true;
        }
        else
            return false;
    }
    
    @Override
    public String toString() 
    {
        return rank + " of " + suit + "," + pointValue;
    }
}
