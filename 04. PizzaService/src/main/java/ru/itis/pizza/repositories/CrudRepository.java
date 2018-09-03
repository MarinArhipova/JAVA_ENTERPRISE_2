package ru.itis.pizza.repositories;

import ru.itis.pizza.models.User;

import java.util.List;

/**
 * 03.09.2018
 * CrudRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface CrudRepository<T> {
    T findOne(Long id);
    void save(T model);
    void delete(Long id);

    List<T> findAll();
}
