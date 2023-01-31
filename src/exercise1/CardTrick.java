package exercise1;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        System.out.print("Enter the value of the card: ");
        int value = input.nextInt();
        System.out.print("Enter the suit of the card: ");
        int suit = input.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit - 1]);

        boolean found = false;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry your card was not found in the hand.");
        }
        
        
        int userValue = input.nextInt();
        String userSuit = input.nextLine();
        
        

        for (int i = 0; i < hand.length; i++) {
            if(hand[i].getValue()==userValue &&
               hand[i].getSuit().equals(userSuit)){
                printInfo();
            }
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    //IM DONE!
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Md Sowad Mukhtadir, but you can call me Sid");
        System.out.println();
        
        System.out.println("My career ambitions: ");
        System.out.println("-- Be more active on");
        System.out.println("-- Pass the semester!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Working out");
        System.out.println("-- Cooking");
        System.out.println("-- Watching TV");
        System.out.println("-- Outdoors");

        System.out.println();
        
    
    }

}
