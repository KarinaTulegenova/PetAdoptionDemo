package org.core.petadoption.base;

public abstract class Pet {
    protected String id;
    protected String name;
    protected int age;
    protected String species;
    protected boolean adopted;

    public Pet(PetArgs args) {
        this.id = args.getId();
        this.name = args.getName();
        this.age = args.getAge();
        this.species = args.getSpecies();
        this.adopted = args.isAdopted();
    }

    public abstract String getDescription();

    public abstract String makeSound();

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    public boolean isAdopted() { return adopted; }
    public void setAdopted(boolean adopted) { this.adopted = adopted; }
}