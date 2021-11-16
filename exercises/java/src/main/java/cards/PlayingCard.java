package cards;

public class PlayingCard {
    private final Suit suit;
    private final int faceValue;

    public PlayingCard(Suit suit, int faceValue) {
        if (faceValue < 1 || faceValue > 13) {
            throw new IllegalArgumentException("faceValue (" + faceValue + ") must be between 1 and 13");
        }
        this.suit = suit;
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return faceValueName() + " of " + suitName();
    }

    private String suitName() {
        return suit.toString().toLowerCase();
    }

    private String faceValueName() {
        switch (faceValue) {
            case 1: return "ace";
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: return "" + faceValue;
            case 11: return "jack";
            case 12: return "queen";
            case 13: return "king";
            default: return null; // cannot happen because of constructor
        }
    }
}
