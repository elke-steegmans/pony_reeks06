package be.ucll.service;

import be.ucll.model.Owner;
import be.ucll.model.Pony;
import be.ucll.repository.OwnerRepository;
import be.ucll.repository.PonyRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PonyService {

    private PonyRepository ponyRepository;
    private OwnerRepository ownerRepository;

    public PonyService(PonyRepository ponyRepository, OwnerRepository ownerRepository) {
        this.ponyRepository = ponyRepository;

        this.ownerRepository = ownerRepository;
    }

    public List<Pony> getAllPonies() {
        return ponyRepository.findAll();
    }

    public Optional<Pony> findPonyByName(String ponyName) {
        return ponyRepository.findByName(ponyName);
    }

    public Pony addOwnerToPony(String ponyName, @Valid Owner owner) {
        Pony foundPony = ponyRepository.findByName(ponyName).orElseThrow(()->new RuntimeException("Pony not found!"));
        ownerRepository.save(owner);
        foundPony.setOwner(owner);
        return ponyRepository.save(foundPony);
    }

//    public void addPony(Pony pony) {
//        ponyRepository.addPony(pony);
//    }
//
//    public Pony updatePony(String name, Pony newDataForExistingPony) {
//        // find pony with name name
////        Pony foundPony = findPonyByName(name);
////        if(foundPony == null)
////            throw new RuntimeException("No pony found with name " + name);
//        Pony foundPony = findPonyByName(name).orElseThrow(()->new RuntimeException("No pony found with name " + name));
////        if(foundPony == null)
////            throw new RuntimeException("No pony found with name " + name);
//        // update pony with new data found in newDataForExistingPony
//        foundPony.setName(newDataForExistingPony.getName());
//        foundPony.setAge(newDataForExistingPony.getAge());
//        return foundPony;
//    }

}
