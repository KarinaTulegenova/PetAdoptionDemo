package org.core.petadoption.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.core.petadoption.base.Pet;
import org.core.petadoption.base.PetArgs;
import org.core.petadoption.factory.CatFactory;
import org.core.petadoption.factory.DogFactory;
import org.core.petadoption.factory.PetFactory;
import org.core.petadoption.factory.RabbitFactory;
import org.core.petadoption.observer.PetShelter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class PetJsonService {

    @Autowired
    private PetShelter petShelter;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @PostConstruct
    public void loadPetsFromJson() {
        try {
            ClassPathResource resource = new ClassPathResource("data/pets.json");
            InputStream inputStream = resource.getInputStream();

            JsonNode rootNode = objectMapper.readTree(inputStream);
            JsonNode petsNode = rootNode.get("pets");

            List<Pet> pets = new ArrayList<>();

            for (JsonNode petNode : petsNode) {
                String id = petNode.get("id").asText();
                String name = petNode.get("name").asText();
                int age = petNode.get("age").asInt();
                String species = petNode.get("species").asText();
                boolean adopted = petNode.has("adopted") && petNode.get("adopted").asBoolean();
                String breed = petNode.has("breed") ? petNode.get("breed").asText() : null;

                PetArgs args = new PetArgs(id, name, age, species, adopted);
                Pet pet = createPetBySpecies(species, args, breed);

                if (pet != null) {
                    pets.add(pet);
                }
            }

            petShelter.setPets(pets);
            System.out.println("Loaded " + pets.size() + " pets from JSON");

        } catch (IOException e) {
            System.err.println("Error loading pets from JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private Pet createPetBySpecies(String species, PetArgs args, String breed) {
        PetFactory factory;

        switch (species.toLowerCase()) {
            case "dog":
                factory = new DogFactory();
                break;
            case "cat":
                factory = new CatFactory();
                break;
            case "rabbit":
                factory = new RabbitFactory();
                break;
            default:
                return null;
        }

        return factory.createPetWithBreed(args, breed);
    }
}