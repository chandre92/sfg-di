package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;

public class PetController {
    private final PetService petService;

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }
}
