package org.core.petadoption.facade;

import org.core.petadoption.adapter.PetAdapter;
import org.core.petadoption.base.Pet;
import org.core.petadoption.controller.dto.PetCardDto;
import org.core.petadoption.controller.dto.PetInfoDto;
import org.core.petadoption.observer.PetShelter;
import org.core.petadoption.strategy.FilterStrategy;
import org.core.petadoption.strategy.NameFilter;
import org.core.petadoption.strategy.NoopFilter;
import org.core.petadoption.strategy.SpeciesFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PetAdoptionFacade implements Facade {

    @Autowired
    private PetShelter petShelter;

    @Override
    public List<PetCardDto> getAllPets() {
        return petShelter.getPets().stream()
                .map(PetAdapter::toPetCardDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<PetCardDto> searchPets(String name, String species) {
        List<Pet> pets = petShelter.getPets();
        FilterStrategy nameFilter = (name != null && !name.isEmpty())
                ? new NameFilter(name)
                : new NoopFilter();
        pets = nameFilter.filter(pets);
        FilterStrategy speciesFilter = (species != null && !species.isEmpty())
                ? new SpeciesFilter(species)
                : new NoopFilter();
        pets = speciesFilter.filter(pets);

        return pets.stream()
                .map(PetAdapter::toPetCardDto)
                .collect(Collectors.toList());
    }

    @Override
    public PetInfoDto getPetDetails(String id) {
        Pet pet = petShelter.getPetById(id);
        return pet != null ? PetAdapter.toPetInfoDto(pet) : null;
    }

    @Override
    public boolean adoptPet(String petId, String adopterName) {
        Pet pet = petShelter.getPetById(petId);
        if (pet != null && !pet.isAdopted()) {
            petShelter.adoptPet(petId);
            return true;
        }
        return false;
    }
}