package org.core.petadoption.factory;

import org.core.petadoption.base.Dog;
import org.core.petadoption.base.Pet;
import org.core.petadoption.base.PetArgs;
import org.core.petadoption.decorators.dog.GermanShepherd;
import org.core.petadoption.decorators.dog.GoldenRetriever;

public class DogFactory implements PetFactory {
    @Override
    public Pet createPet(PetArgs args) {
        return new Dog(args);
    }

    @Override
    public Pet createPetWithBreed(PetArgs args, String breed) {
        Pet dog = new Dog(args);

        if (breed == null || breed.isEmpty()) {
            return dog;
        }

        switch (breed.toLowerCase()) {
            case "german shepherd":
            case "shepherd":
                return new GermanShepherd(dog);
            case "golden retriever":
            case "golden":
                return new GoldenRetriever(dog);
            default:
                return dog;
        }
    }
}