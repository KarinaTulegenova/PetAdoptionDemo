package org.core.petadoption.decorators.rabbit;

import org.core.petadoption.base.Pet;
import org.core.petadoption.decorators.BreedDecorator;

public class HollandLop extends BreedDecorator {
    public HollandLop(Pet pet) {
        super(pet, "Holland Lop");
    }

    @Override
    public String getDescription() {
        return decoratedPet.getDescription() + " - Holland Lop breed with adorable floppy ears";
    }
}