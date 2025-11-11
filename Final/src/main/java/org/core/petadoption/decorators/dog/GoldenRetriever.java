package org.core.petadoption.decorators.dog;

import org.core.petadoption.base.Pet;
import org.core.petadoption.decorators.BreedDecorator;

public class GoldenRetriever extends BreedDecorator {
    public GoldenRetriever(Pet pet) {
        super(pet, "Golden Retriever");
    }

    @Override
    public String getDescription() {
        return decoratedPet.getDescription() + " - Golden Retriever breed, friendly and devoted";
    }
}