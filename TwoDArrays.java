/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.twodarrays;
import java.util.Random;
/**
 *
 * @author bebreo2027
 */
public class TwoDArrays {

    public static void main(String[] args) {
        //2d array with 4 suits and 13 numbers
        String[][] deck = new String[4][13];
        String suitName = "";
        //if the number has a special name, like Ace or King
        String numTitle = "";
        Random r = new Random();
        // load the 2d array with the cards and name the suits accordingly
        for (int suit=0; suit < deck.length; suit++) {
            switch (suit){
                case 0:
                    suitName = "Clubs";
                    break;
                case 1:
                    suitName = "Spades";
                    break;
                case 2:
                    suitName = "Hearts";
                    break;
                case 3:
                    suitName = "Diamonds";
                    break;
                default:
                    throw new AssertionError();
            }
            for (int l=0; l < deck[suit].length; l++) {
                switch (l) {
                    case 0:
                        numTitle = "Ace";
                        break;
                    case 10:
                        numTitle = "Jack";
                        break;
                    case 11:
                        numTitle = "Queen";
                        break;
                    case 12:
                        numTitle = "King";
                        break;
                    default:
                        numTitle = numTitle.valueOf(l + 1);
                }
                deck[suit][l]= numTitle + " of " + suitName;
            }
        }
        System.out.println("4 hands of 5 random cards: \n");
        for (int i = 1; i < 5; i++) {
            System.out.println("Hand #" + i);
            for (int j = 0; j < 5; j++) {
                int randSuit = r.nextInt(deck.length);
                //If all cards in one suit are drawn (null), the suit changes
                for (int k = 0; k < deck[randSuit].length; k++) {
                    if (deck[randSuit][k] != null) {
                        break;
                    }
                    if (k == deck[randSuit].length - 1) {
                        randSuit = r.nextInt(deck.length);
                    }
                }
                int randNum = r.nextInt(deck[randSuit].length);
                //If the card within the suit is drawn, pick another card
                while (deck[randSuit][randNum] == null) {
                    randNum = r.nextInt(deck[randSuit].length);
                }
                System.out.println(deck[randSuit][randNum]);
                //null after the card is drawn
                deck[randSuit][randNum] = null;
                if (j == 4) {
                    System.out.println("");
                }
            }
        }
    }
    
    
}
