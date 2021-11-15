package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    String[] getCards() {
        String[] result = new String[52];
        PlayingCard[] deck = new PlayingCard[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck[suit * 13 + faceValue] = new PlayingCard(Suit.values()[suit], faceValue);
            }
        }

        int cardNumber = 0;
        for (PlayingCard card : deck) {
            result[cardNumber] = card.toString();
            cardNumber++;
        }

        return result;
    }
}
