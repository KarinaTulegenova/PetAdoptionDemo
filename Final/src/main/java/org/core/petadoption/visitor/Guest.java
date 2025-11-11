package org.core.petadoption.visitor;

import org.core.petadoption.base.Pet;

public class Guest implements Person {
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    @Override
    public String interact(Pet pet) {
        return String.format("%s (Guest) is viewing %s: %s",
                name, pet.getName(), pet.getDescription());
    }

    @Override
    public String getRole() {
        return "Guest";
    }

    public String getName() {
        return name;
    }
}