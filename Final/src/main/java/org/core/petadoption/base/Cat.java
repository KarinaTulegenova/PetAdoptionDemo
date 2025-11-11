package org.core.petadoption.base;

public class Cat extends Pet {
    public Cat(PetArgs args) {
        super(args);
        this.species = "Cat";
    }

    @Override
    public String getDescription() {
        return "An independent and graceful cat named " + name;
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }
}