package org.core.petadoption.decorators.cat;

import org.core.petadoption.base.Pet;
import org.core.petadoption.decorators.BreedDecorator;

public class SiameseCat extends BreedDecorator {
    public SiameseCat(Pet pet) {
        super(pet, "Siamese");
    }

    @Override
    public String getDescription() {
        return decoratedPet.getDescription() + " - Siamese breed with blue almond-shaped eyes and vocal personality";
    }
}