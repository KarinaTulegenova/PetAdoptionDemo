package org.core.petadoption.controller.dto;

public class PetInfoDto {
    private String id;
    private String name;
    private int age;
    private String species;
    private String breed;
    private boolean adopted;
    private String description;
    private String sound;

    public PetInfoDto() {}

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

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getSound() { return sound; }
    public void setSound(String sound) { this.sound = sound; }
}