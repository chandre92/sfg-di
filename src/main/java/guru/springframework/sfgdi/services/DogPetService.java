package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;

@Profile({"dog", "default"})
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs Are the Best!";
    }
}
