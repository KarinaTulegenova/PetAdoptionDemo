package org.core.petadoption.strategy;

import org.core.petadoption.base.Pet;
import java.util.List;
import java.util.stream.Collectors;

public interface FilterStrategy {
    List<Pet> filter(List<Pet> pets);
}