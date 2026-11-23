package com.sioms.repository;


import com.sioms.interfaces.repository.BaseRepoInterface;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class BaseRepo<T, ID> implements BaseRepoInterface<T, ID> {
    private final Function<T, ID> idExtractor;

    public BaseRepo(Function<T, ID> idExtractor){
        this.idExtractor = idExtractor;
    }

    @Override
    public void save(T entity) {
        ID id = idExtractor.apply(entity);
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.empty();
    }

    @Override
    public List<T> findAll() {
        return List.of();
    }

    @Override
    public boolean update(ID id, T entity) {
        return false;
    }

    @Override
    public boolean delete(ID id) {
        return false;
    }
}