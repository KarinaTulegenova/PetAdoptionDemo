package org.core.petadoption.observer;

import org.core.petadoption.base.Pet;

public interface Observer {
    void update(Pet pet, String event);
}