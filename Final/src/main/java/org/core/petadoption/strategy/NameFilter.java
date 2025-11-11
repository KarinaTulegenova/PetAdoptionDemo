package org.core.petadoption.strategy;

import org.core.petadoption.base.Pet;
import java.util.List;
import java.util.stream.Collectors;

public class NameFilter implements FilterStrategy {
    private String nameQuery;

    public NameFilter(String nameQuery) {
        this.nameQuery = nameQuery != null ? nameQuery.toLowerCase() : "";
    }

    @Override
    public List<Pet> filter(List<Pet> pets) {
        if (nameQuery.isEmpty()) {
            return pets;
        }
        return pets.stream()
                .filter(pet -> pet.getName().toLowerCase().contains(nameQuery))
                .collect(Collectors.toList());
    }
}