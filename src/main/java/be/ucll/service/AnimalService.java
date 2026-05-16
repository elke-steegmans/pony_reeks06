package be.ucll.service;

import be.ucll.model.Animal;
import be.ucll.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> allAnimals() {
        return animalRepository.findAll();
    }
}
