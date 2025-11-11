package org.core.petadoption.decorators.cat;

import org.core.petadoption.base.Pet;
import org.core.petadoption.decorators.BreedDecorator;

public class BritishShorthair extends BreedDecorator {
    public BritishShorthair(Pet pet) {
        super(pet, "British Shorthair");
    }

    @Override
    public String getDescription() {
        return decoratedPet.getDescription() + " - British Shorthair breed with round face and plush coat";
    }
}