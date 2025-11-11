package org.core.petadoption.decorators.rabbit;

import org.core.petadoption.base.Pet;
import org.core.petadoption.decorators.BreedDecorator;

public class NetherlandDwarf extends BreedDecorator {
    public NetherlandDwarf(Pet pet) {
        super(pet, "Netherland Dwarf");
    }

    @Override
    public String getDescription() {
        return decoratedPet.getDescription() + " - Netherland Dwarf breed, tiny and compact with short ears";
    }
}