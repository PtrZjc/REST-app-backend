package pl.zajacp.domain.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.zajacp.domain.dao.IDao;
import pl.zajacp.domain.model.Book;

@Service
public class ServiceTestBookDao {

    private final IDao<Book> bookDao;

    @Autowired
    ServiceTestBookDao(IDao<Book> bookDao){
        this.bookDao = bookDao;
    }

    void generateBooks(){

        Book book1 = new Book("9788324631766",
                "Thinking in Java",
                "Bruce Eckel",
                "Helion", "programming");
        Book book2 = new Book("9788324627738",
                "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert",
                "Helion", "programming");
        Book book3 = new Book("9780130819338",
                "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell",
                "Helion", "programming");

        bookDao.save(book1);
        bookDao.save(book2);
        bookDao.save(book3);
    }


}
