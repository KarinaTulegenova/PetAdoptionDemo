package org.core.petadoption.factory;

import org.core.petadoption.base.Cat;
import org.core.petadoption.base.Pet;
import org.core.petadoption.base.PetArgs;
import org.core.petadoption.decorators.cat.BritishShorthair;
import org.core.petadoption.decorators.cat.SiameseCat;

public class CatFactory implements PetFactory {
    @Override
    public Pet createPet(PetArgs args) {
        return new Cat(args);
    }

    @Override
    public Pet createPetWithBreed(PetArgs args, String breed) {
        Pet cat = new Cat(args);

        if (breed == null || breed.isEmpty()) {
            return cat;
        }

        switch (breed.toLowerCase()) {
            case "british shorthair":
            case "british":
                return new BritishShorthair(cat);
            case "siamese":
                return new SiameseCat(cat);
            default:
                return cat;
        }
    }
}