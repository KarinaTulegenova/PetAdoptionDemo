package org.core.petadoption.visitor;

import org.core.petadoption.base.Pet;

public class Volunteer implements Person {
    private String name;

    public Volunteer(String name) {
        this.name = name;
    }

    @Override
    public String interact(Pet pet) {
        return String.format("%s (Volunteer) is caring for %s: feeding and playing. %s says: %s",
                name, pet.getName(), pet.getName(), pet.makeSound());
    }

    @Override
    public String getRole() {
        return "Volunteer";
    }

    public String getName() {
        return name;
    }
}