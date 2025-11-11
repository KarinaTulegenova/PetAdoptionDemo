package org.core.petadoption.strategy;

import org.core.petadoption.base.Pet;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrategy {
    public enum SortType {
        NAME_ASC, NAME_DESC, AGE_ASC, AGE_DESC, NONE
    }

    private SortType sortType;

    public SortStrategy(SortType sortType) {
        this.sortType = sortType != null ? sortType : SortType.NONE;
    }

    public List<Pet> sort(List<Pet> pets) {
        switch (sortType) {
            case NAME_ASC:
                return pets.stream()
                        .sorted(Comparator.comparing(Pet::getName))
                        .collect(Collectors.toList());
            case NAME_DESC:
                return pets.stream()
                        .sorted(Comparator.comparing(Pet::getName).reversed())
                        .collect(Collectors.toList());
            case AGE_ASC:
                return pets.stream()
                        .sorted(Comparator.comparing(Pet::getAge))
                        .collect(Collectors.toList());
            case AGE_DESC:
                return pets.stream()
                        .sorted(Comparator.comparing(Pet::getAge).reversed())
                        .collect(Collectors.toList());
            case NONE:
            default:
                return pets;
        }
    }
}