package org.core.petadoption.controller.dto;

public class PetCardDto {
    private String id;
    private String name;
    private int age;
    private String species;
    private String breed;
    private boolean adopted;

    // Constructors
    public PetCardDto() {}

    public PetCardDto(String id, String name, int age, String species, String breed, boolean adopted) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.species = species;
        this.breed = breed;
        this.adopted = adopted;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public boolean isAdopted() { return adopted; }
    public void setAdopted(boolean adopted) { this.adopted = adopted; }
}