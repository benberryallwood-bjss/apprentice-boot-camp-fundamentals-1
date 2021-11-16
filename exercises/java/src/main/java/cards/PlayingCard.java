package cards;

public class PlayingCard implements Card {
    private final Suit suit;
    private final String faceValue;

    public PlayingCard(Suit suit, int faceValue) {
        this.suit = suit;

        switch (faceValue) {
            case 1: this.faceValue = "ace"; break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: this.faceValue = "" + faceValue; break;
            case 11: this.faceValue = "jack"; break;
            case 12: this.faceValue = "queen"; break;
            case 13: this.faceValue = "king"; break;
            default: throw new IllegalArgumentException("faceValue (" + faceValue + ") must be between 1 and 13");
        }
    }

    @Override
    public String toString() {
        return faceValue + " of " + suitName();
    }

    private String suitName() {
        return suit.toString().toLowerCase();
    }

    @Override
    public boolean snap(Card otherCard) {
         String otherFaceValue = otherCard.toString()
                 .split(" ")[0];
         return faceValue.equals(otherFaceValue);
    }
}
