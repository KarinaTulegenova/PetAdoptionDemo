package org.core.petadoption.visitor;

import org.core.petadoption.base.Pet;

public class PetAdoption implements Person {
    private String adopterName;

    public PetAdoption(String adopterName) {
        this.adopterName = adopterName;
    }

    @Override
    public String interact(Pet pet) {
        if (pet.isAdopted()) {
            return String.format("%s attempted to adopt %s, but this pet is already adopted!",
                    adopterName, pet.getName());
        }
        return String.format("%s is adopting %s! Congratulations on your new family member!",
                adopterName, pet.getName());
    }

    @Override
    public String getRole() {
        return "Adopter";
    }

    public String getAdopterName() {
        return adopterName;
    }
}