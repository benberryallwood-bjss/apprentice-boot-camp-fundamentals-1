package cards;

import java.util.Collections;
import java.util.List;

public interface Deck {
    List<Card> getCardList();

    default String[] getCards() {
        String[] result = new String[getCardList().size()];
        int cardNumber = 0;
        for (Card card : getCardList()) {
            result[cardNumber] = card.toString();
            cardNumber++;
        }
        return result;
    }

    default void shuffle() {
        Collections.shuffle(getCardList());
    }

    default Card deal() {
        return getCardList().remove(0);
    }
}
