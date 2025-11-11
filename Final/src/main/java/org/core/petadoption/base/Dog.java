package org.core.petadoption.base;

public class Dog extends Pet {
    public Dog(PetArgs args) {
        super(args);
        this.species = "Dog";
    }

    @Override
    public String getDescription() {
        return "A loyal and friendly dog named " + name;
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }
}