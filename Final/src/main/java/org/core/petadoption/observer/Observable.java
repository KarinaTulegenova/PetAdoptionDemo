package org.core.petadoption.observer;

public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(org.core.petadoption.base.Pet pet, String event);
}