package org.core.petadoption.factory;

import org.core.petadoption.base.Pet;
import org.core.petadoption.base.PetArgs;
import org.core.petadoption.base.Rabbit;
import org.core.petadoption.decorators.rabbit.HollandLop;
import org.core.petadoption.decorators.rabbit.NetherlandDwarf;

public class RabbitFactory implements PetFactory {
    @Override
    public Pet createPet(PetArgs args) {
        return new Rabbit(args);
    }

    @Override
    public Pet createPetWithBreed(PetArgs args, String breed) {
        Pet rabbit = new Rabbit(args);

        if (breed == null || breed.isEmpty()) {
            return rabbit;
        }

        switch (breed.toLowerCase()) {
            case "holland lop":
            case "lop":
                return new HollandLop(rabbit);
            case "netherland dwarf":
            case "dwarf":
                return new NetherlandDwarf(rabbit);
            default:
                return rabbit;
        }
    }
}