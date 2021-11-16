package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class DeckWithList implements Deck {
     private final List<Card> cards;

     DeckWithList() {
         cards = new ArrayList<>();
     }

     public String[] getCards() {
        String[] result = new String[cards.size()];
        int cardNumber = 0;
        for (Card card : cards) {
            result[cardNumber] = card.toString();
            cardNumber++;
        }
        return result;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        if (cards.size() == 0) {
            return null;
        }
        return cards.remove(0);
    }

    void add(Card card) {
         cards.add(card);
    }
}
