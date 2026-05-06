package be.ucll.unit.service;

import be.ucll.model.Pony;
import be.ucll.repository.PonyRepository;
import be.ucll.service.PonyService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PonyServiceTest {

    @Test
    public void givenExistingPony_whenFindingThatPony_thenPonyIsReturned () {
        //given
        PonyRepository ponyRepository = new PonyRepositoryStub();
        PonyService ponyService = new PonyService(ponyRepository);

        // when
        if(ponyService.findPonyByName("Bella").isPresent()){
            Pony foundPony = ponyService.findPonyByName("Bella").get();
            // then
            assertEquals("Bella", foundPony.getName());
            assertEquals(5, foundPony.getAge());
        }
    }

}
