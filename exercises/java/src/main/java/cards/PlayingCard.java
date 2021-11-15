package cards;

public class PlayingCard {
    private int suit;
    private int faceValue;

    public PlayingCard(int suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue + 1;
    }

    @Override
    public String toString() {
        return faceValueName() + " of " + suitName();
    }

    private String suitName() {
        switch (suit) {
            case 0: return "clubs";
            case 1: return "diamonds";
            case 2: return "hearts";
            case 3: return "spades";
            default: return null;
        }
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
            default: return null;
        }
    }
}
