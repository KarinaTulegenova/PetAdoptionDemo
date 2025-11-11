package org.core.petadoption.decorators.dog;

import org.core.petadoption.base.Pet;
import org.core.petadoption.decorators.BreedDecorator;

public class GermanShepherd extends BreedDecorator {
    public GermanShepherd(Pet pet) {
        super(pet, "German Shepherd");
    }

    @Override
    public String getDescription() {
        return decoratedPet.getDescription() + " - German Shepherd breed, intelligent and protective";
    }
}