package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AnimalDeck implements Deck {

    private final List<Card> cards;

    AnimalDeck() {
        cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        int cardNumber = 0;
        for (Card card : cards) {
            result[cardNumber] = card.toString();
            cardNumber++;
        }
        return result;
    }

    @Override
    public Card deal() {
        return cards.remove(0);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
