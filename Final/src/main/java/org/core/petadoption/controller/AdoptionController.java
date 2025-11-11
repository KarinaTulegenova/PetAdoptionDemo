
// AdoptionController.java
package org.core.petadoption.controller;

import org.core.petadoption.base.Pet;
import org.core.petadoption.controller.dto.AdoptionRequest;
import org.core.petadoption.controller.dto.AdoptionResponse;
import org.core.petadoption.controller.dto.PetInfoDto;
import org.core.petadoption.facade.PetAdoptionFacade;
import org.core.petadoption.observer.Observer;
import org.core.petadoption.observer.PetShelter;
import org.core.petadoption.visitor.PetAdoption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/adoption")
@CrossOrigin(origins = "*")
public class AdoptionController implements Observer {

    @Autowired
    private PetAdoptionFacade facade;

    @Autowired
    private PetShelter petShelter;

    @Autowired
    public void init() {
        petShelter.registerObserver(this);
    }

    @PostMapping
    public ResponseEntity<AdoptionResponse> adoptPet(@RequestBody AdoptionRequest request) {
        PetInfoDto pet = facade.getPetDetails(request.getPetId());

        if (pet == null) {
            return ResponseEntity.ok(new AdoptionResponse(false, "Pet not found"));
        }

        if (pet.isAdopted()) {
            return ResponseEntity.ok(new AdoptionResponse(false, "This pet has already been adopted"));
        }

        boolean success = facade.adoptPet(request.getPetId(), request.getAdopterName());

        if (success) {
            // Use Visitor pattern
            Pet actualPet = petShelter.getPetById(request.getPetId());
            PetAdoption adoption = new PetAdoption(request.getAdopterName());
            String interactionMessage = adoption.interact(actualPet);

            pet.setAdopted(true);
            return ResponseEntity.ok(new AdoptionResponse(true, interactionMessage, pet));
        } else {
            return ResponseEntity.ok(new AdoptionResponse(false, "Adoption failed"));
        }
    }

    @Override
    public void update(Pet pet, String event) {
        System.out.println("Observer notified: " + event + " for pet " + pet.getName());
    }
}