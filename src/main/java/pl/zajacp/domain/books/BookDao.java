package pl.zajacp.domain.books;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.zajacp.domain.dao.AbstractDao;
import pl.zajacp.domain.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class BookDao extends AbstractDao {

    @PersistenceContext
    private EntityManager entityManager;

    public BookDao() {
        setClass(Book.class);
    }
}

