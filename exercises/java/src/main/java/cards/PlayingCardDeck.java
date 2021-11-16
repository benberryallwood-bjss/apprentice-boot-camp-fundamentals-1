package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck implements Deck {
    private final List<Card> cards;

    public PlayingCardDeck() {
        cards = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (int faceValue = 1; faceValue < 14; faceValue++) {
                cards.add(new PlayingCard(suit, faceValue));
            }
        }
    }

    @Override
    public List<Card> getCardList() {
        return cards;
    }

//    @Override
//    public String[] getCards() {
//        String[] result = new String[52];
//        int cardNumber = 0;
//        for (Card card : cards) {
//            result[cardNumber] = card.toString();
//            cardNumber++;
//        }
//        return result;
//    }

//    @Override
//    public Card deal() {
//        return cards.remove(0);
//    }

//    @Override
//    public void shuffle() {
//        Collections.shuffle(cards);
//    }
}
