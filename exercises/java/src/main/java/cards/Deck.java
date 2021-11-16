package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Deck {
     private final List<Card> cards;

     Deck() {
         cards = new ArrayList<>();
     }

     String[] getCards() {
        String[] result = new String[cards.size()];
        int cardNumber = 0;
        for (Card card : cards) {
            result[cardNumber] = card.toString();
            cardNumber++;
        }
        return result;
    }

    void shuffle() {
        Collections.shuffle(cards);
    }

    Card deal() {
        return cards.remove(0);
    }

    void add(Card card) {
         cards.add(card);
    }
}
