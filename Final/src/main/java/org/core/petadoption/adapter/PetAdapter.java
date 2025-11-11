package org.core.petadoption.adapter;

import org.core.petadoption.base.Pet;
import org.core.petadoption.controller.dto.PetCardDto;
import org.core.petadoption.controller.dto.PetInfoDto;
import org.core.petadoption.decorators.BreedDecorator;

public class PetAdapter {

    public static PetCardDto toPetCardDto(Pet pet) {
        PetCardDto dto = new PetCardDto();
        dto.setId(pet.getId());
        dto.setName(pet.getName());
        dto.setAge(pet.getAge());
        dto.setSpecies(pet.getSpecies());
        dto.setAdopted(pet.isAdopted());

        if (pet instanceof BreedDecorator) {
            dto.setBreed(((BreedDecorator) pet).getBreed());
        }

        return dto;
    }

    public static PetInfoDto toPetInfoDto(Pet pet) {
        PetInfoDto dto = new PetInfoDto();
        dto.setId(pet.getId());
        dto.setName(pet.getName());
        dto.setAge(pet.getAge());
        dto.setSpecies(pet.getSpecies());
        dto.setAdopted(pet.isAdopted());
        dto.setDescription(pet.getDescription());
        dto.setSound(pet.makeSound());

        if (pet instanceof BreedDecorator) {
            dto.setBreed(((BreedDecorator) pet).getBreed());
        }

        return dto;
    }
}