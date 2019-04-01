package pl.zajacp.domain.dao;

import java.util.List;

public interface IDao<T> {

    T findById(long id);

    List<T> findAll();

    void save(T entity);

    T update(T entity);

    void delete(T entity);

    void deleteById(long entityId);
}
