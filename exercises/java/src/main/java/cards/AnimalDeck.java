package cards;

class AnimalDeck extends DeckWithList {
    public AnimalDeck() {
        for (Animal animal : Animal.values()) {
            add(new AnimalCard(animal));
            add(new AnimalCard(animal));
        }
    }
}
