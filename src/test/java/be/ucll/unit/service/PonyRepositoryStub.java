package be.ucll.unit.service;

import be.ucll.model.Pony;
import be.ucll.repository.PonyRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class PonyRepositoryStub implements PonyRepository {

    private List<Pony> ponies = new ArrayList<>();

    public PonyRepositoryStub() {
        reset();
    }

    @Override
    public List<Pony> findAll() {
        return List.of();
    }

//    public List<Pony> getPonies() {
//        return ponies;
//    }

    public Optional<Pony> findByName(String ponyName) {
        for(Pony pony : ponies) {
            if(pony.getName().equals(ponyName))
                return Optional.of(pony);
        }
        return Optional.empty();
    }

    public void addPony(Pony pony) {
        ponies.add(pony);
    }

    public void reset() {
        ponies.clear();

        Pony bella = new Pony("Bella", 5);
        Pony luna = new Pony("Luna", 7);

        ponies.add(bella);
        ponies.add(luna);
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Pony> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Pony> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Pony> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Pony getOne(Long aLong) {
        return null;
    }

    @Override
    public Pony getById(Long aLong) {
        return null;
    }

    @Override
    public Pony getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Pony> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Pony> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Pony> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Pony> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Pony> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Pony> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Pony, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Pony> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Pony> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Pony> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Pony> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Pony entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Pony> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Pony> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Pony> findAll(Pageable pageable) {
        return null;
    }
}
