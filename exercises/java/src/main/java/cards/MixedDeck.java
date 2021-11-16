package cards;

public class MixedDeck extends DeckWithList {
    public MixedDeck() {
        AnimalDeck animalDeck = new AnimalDeck();
        PlayingCardDeck playingCardDeck = new PlayingCardDeck();

        Card currentCard = animalDeck.deal();
        while (currentCard != null) {
            add(currentCard);
            currentCard = animalDeck.deal();
        }

        currentCard = playingCardDeck.deal();
        while(currentCard != null) {
            add(currentCard);
            currentCard = playingCardDeck.deal();
        }
    }
}
