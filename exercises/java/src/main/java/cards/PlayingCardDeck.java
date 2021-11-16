package cards;

public class PlayingCardDeck extends Deck {
    public PlayingCardDeck() {
        for (Suit suit : Suit.values()) {
            for (int faceValue = 1; faceValue < 14; faceValue++) {
                add(new PlayingCard(suit, faceValue));
            }
        }
    }
}
