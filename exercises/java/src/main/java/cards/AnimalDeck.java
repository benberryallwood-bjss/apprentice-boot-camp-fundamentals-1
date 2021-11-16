package cards;

class AnimalDeck extends Deck {
    public AnimalDeck() {
        for (Animal animal : Animal.values()) {
            add(new AnimalCard(animal));
            add(new AnimalCard(animal));
        }
    }
}
