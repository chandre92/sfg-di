package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service("cat")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cars Are the Best!";
    }
}
