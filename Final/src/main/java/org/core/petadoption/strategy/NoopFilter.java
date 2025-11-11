package org.core.petadoption.strategy;

import org.core.petadoption.base.Pet;
import java.util.List;

public class NoopFilter implements FilterStrategy {
    @Override
    public List<Pet> filter(List<Pet> pets) {
        return pets;
    }
}