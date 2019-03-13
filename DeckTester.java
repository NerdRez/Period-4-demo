/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) 
    {
        String [] ranks = {"Ace","2","3", "4", "5","6","7","8","9","10", "Jack", "Queen", "King"};
        String [] suits = {"Clubs", "Diamonds", "Spades", "hearts"};
        int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Deck tester = new Deck(ranks,suits,num);
        System.out.println(tester);
        //perfectShuffle(tester);
    }
}
