package org.core.petadoption.base;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PetArgs {
    private String id;
    private String name;
    private int age;
    private String species;
    private boolean adopted;

    public PetArgs(String id, String name, int age, String species, boolean adopted) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.species = species;
        this.adopted = adopted;
    }

}