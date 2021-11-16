package cards;

public class MixedDeck extends DeckWithList {
    public MixedDeck() {
        addCardsFromDeck(new AnimalDeck());
        addCardsFromDeck(new PlayingCardDeck());
    }

    private void addCardsFromDeck(Deck deck) {
        Card currentCard = deck.deal();
        while (currentCard != null) {
            add(currentCard);
            currentCard = deck.deal();
        }
    }
}
