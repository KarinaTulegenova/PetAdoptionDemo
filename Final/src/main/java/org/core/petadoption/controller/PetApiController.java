package org.core.petadoption.controller;

import org.core.petadoption.controller.dto.PetCardDto;
import org.core.petadoption.controller.dto.PetInfoDto;
import org.core.petadoption.facade.PetAdoptionFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
@CrossOrigin(origins = "*")
public class PetApiController {

    @Autowired
    private PetAdoptionFacade facade;

    @GetMapping
    public ResponseEntity<List<PetCardDto>> getAllPets(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String species) {

        List<PetCardDto> pets;

        if (name != null || species != null) {
            pets = facade.searchPets(name, species);
        } else {
            pets = facade.getAllPets();
        }

        return ResponseEntity.ok(pets);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PetInfoDto> getPetById(@PathVariable String id) {
        PetInfoDto pet = facade.getPetDetails(id);

        if (pet != null) {
            return ResponseEntity.ok(pet);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/species/{species}")
    public ResponseEntity<List<PetCardDto>> getPetsBySpecies(@PathVariable String species) {
        List<PetCardDto> pets = facade.searchPets(null, species);
        return ResponseEntity.ok(pets);
    }
}