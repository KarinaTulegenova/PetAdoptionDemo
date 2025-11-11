package org.core.petadoption.decorators;

import org.core.petadoption.base.Pet;

public abstract class BreedDecorator extends PetDecorator {
    protected String breed;

    public BreedDecorator(Pet pet, String breed) {
        super(pet);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}