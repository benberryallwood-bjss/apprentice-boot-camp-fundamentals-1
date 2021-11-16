package cards;

import java.util.Collections;
import java.util.List;

public abstract class Deck {
     protected List<Card> cards;

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
}
