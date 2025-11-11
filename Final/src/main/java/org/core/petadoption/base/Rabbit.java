package org.core.petadoption.base;

public class Rabbit extends Pet {
    public Rabbit(PetArgs args) {
        super(args);
        this.species = "Rabbit";
    }

    @Override
    public String getDescription() {
        return "A cute and fluffy rabbit named " + name;
    }

    @Override
    public String makeSound() {
        return "Squeak!";
    }
}