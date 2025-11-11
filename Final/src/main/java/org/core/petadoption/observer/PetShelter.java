package org.core.petadoption.observer;

import org.core.petadoption.base.Pet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PetShelter implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Pet pet, String event) {
        for (Observer observer : observers) {
            observer.update(pet, event);
        }
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        notifyObservers(pet, "PET_ADDED");
    }

    public void adoptPet(String petId) {
        for (Pet pet : pets) {
            if (pet.getId().equals(petId) && !pet.isAdopted()) {
                pet.setAdopted(true);
                notifyObservers(pet, "PET_ADOPTED");
                break;
            }
        }
    }

    public List<Pet> getPets() {
        return new ArrayList<>(pets);
    }

    public Pet getPetById(String id) {
        return pets.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void setPets(List<Pet> pets) {
        this.pets = new ArrayList<>(pets);
    }
}