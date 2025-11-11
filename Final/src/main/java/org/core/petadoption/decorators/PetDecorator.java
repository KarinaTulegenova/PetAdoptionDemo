package org.core.petadoption.decorators;

import org.core.petadoption.base.Pet;

public abstract class PetDecorator extends Pet {
    protected Pet decoratedPet;

    public PetDecorator(Pet pet) {
        super(new org.core.petadoption.base.PetArgs(
                pet.getId(), pet.getName(), pet.getAge(), pet.getSpecies(), pet.isAdopted()
        ));
        this.decoratedPet = pet;
    }

    @Override
    public abstract String getDescription();

    @Override
    public String makeSound() {
        return decoratedPet.makeSound();
    }
}