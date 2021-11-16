package cards;

public class AnimalCard implements Card {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean snap( Card otherCard ){
        return otherCard != null && toString().equals(otherCard.toString());
    }

//    @Override
//    public String comparisonValue() {
//        return animal.toString();
//    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
