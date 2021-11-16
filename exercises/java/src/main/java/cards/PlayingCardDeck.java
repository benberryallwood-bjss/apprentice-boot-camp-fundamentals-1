package cards;

public class PlayingCardDeck {
    private final PlayingCard[] cards;

    public PlayingCardDeck() {
        cards = new PlayingCard[52];

        for (Suit suit : Suit.values()) {
            for (int faceValue = 1; faceValue < 14; faceValue++) {
                cards[suit.ordinal() * 13 + faceValue - 1] = new PlayingCard(suit, faceValue);
            }
        }
    }

    public String[] getCards() {
        String[] result = new String[52];
        int cardNumber = 0;
        for (PlayingCard card : cards) {
            result[cardNumber] = card.toString();
            cardNumber++;
        }
        return result;
    }
}
