package be.ucll.repository;

import be.ucll.model.Chicken;
import be.ucll.model.Pony;
import be.ucll.model.Stable;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DBInitializer {

    private PonyRepository ponyRepository;
    private AnimalRepository animalRepository;
    private StableRepository stableRepository;

    public DBInitializer(PonyRepository ponyRepository, AnimalRepository animalRepository, StableRepository stableRepository) {
        this.ponyRepository = ponyRepository;
        this.animalRepository = animalRepository;
        this.stableRepository = stableRepository;
    }

    @PostConstruct
    public void initialize() {

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();

        stableRepository.save(stable1);
        stableRepository.save(stable2);

        Pony bella = new Pony("Bella", 5);
        Chicken freddy = new Chicken(true);

        bella.setStable(stable1);
        freddy.setStable(stable2);

        ponyRepository.save(bella);
        animalRepository.save(freddy);

        ponyRepository.save(new Pony("Luna", 7));

    }
}
