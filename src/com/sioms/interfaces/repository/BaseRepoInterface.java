package com.sioms.interfaces.repository;

import java.util.List;
import java.util.Optional;


public interface BaseRepoInterface<T, ID>{
    void save(T entity);

    Optional<T> findById(ID id);

    List<T> findAll();

    boolean update(ID id, T entity);

    boolean delete(ID id);
}