package cards;

import java.util.ArrayList;

public class PlayingCardDeck extends Deck {
    public PlayingCardDeck() {
        for (Suit suit : Suit.values()) {
            for (int faceValue = 1; faceValue < 14; faceValue++) {
                cards.add(new PlayingCard(suit, faceValue));
            }
        }
    }
}
