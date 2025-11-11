package org.core.petadoption.visitor;

import org.core.petadoption.base.Pet;

public interface Person {
    String interact(Pet pet);
    String getRole();
}