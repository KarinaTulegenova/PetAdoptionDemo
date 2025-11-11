package org.core.petadoption.strategy;

import org.core.petadoption.base.Pet;
import java.util.List;
import java.util.stream.Collectors;

public class SpeciesFilter implements FilterStrategy {
    private String species;

    public SpeciesFilter(String species) {
        this.species = species != null ? species.toLowerCase() : "";
    }

    @Override
    public List<Pet> filter(List<Pet> pets) {
        if (species.isEmpty()) {
            return pets;
        }
        return pets.stream()
                .filter(pet -> pet.getSpecies().toLowerCase().equals(species))
                .collect(Collectors.toList());
    }
}