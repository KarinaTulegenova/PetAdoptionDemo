package org.core.petadoption.factory;

import org.core.petadoption.base.Pet;
import org.core.petadoption.base.PetArgs;

public interface PetFactory {
    Pet createPet(PetArgs args);
    Pet createPetWithBreed(PetArgs args, String breed);
}