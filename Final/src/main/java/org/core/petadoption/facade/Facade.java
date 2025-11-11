package org.core.petadoption.facade;

import org.core.petadoption.base.Pet;
import org.core.petadoption.controller.dto.PetCardDto;
import org.core.petadoption.controller.dto.PetInfoDto;

import java.util.List;

public interface Facade {
    List<PetCardDto> getAllPets();
    List<PetCardDto> searchPets(String name, String species);
    PetInfoDto getPetDetails(String id);
    boolean adoptPet(String petId, String adopterName);
}