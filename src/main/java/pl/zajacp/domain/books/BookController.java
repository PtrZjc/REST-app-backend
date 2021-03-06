package pl.zajacp.domain.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import pl.zajacp.domain.model.Book;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/books")
public class BookController {

    private final ServiceTestBookDao serviceTestBookDao;

    @Autowired
    public BookController(ServiceTestBookDao serviceTestBookDao) {
        this.serviceTestBookDao = serviceTestBookDao;
    }


    @GetMapping
    public void addBooks() {
        serviceTestBookDao.generateBooks();
    }


/*
    //Old non-generic methods, to be rewritten:

    @GetMapping
    public List<Book> getAllBooks() {
        return memoryBookService.getList();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable long id) {
        return memoryBookService.getList().stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElseThrow(NullPointerException::new);
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        memoryBookService.getList().add(book);
    }

    @PutMapping
    public Book modifyBook(@RequestBody Book bookParams) {
        Book book = memoryBookService.getList().stream()
                .filter(x -> x.getId() == bookParams.getId())
                .findFirst()
                .orElseThrow(NullPointerException::new);

        if (bookParams.getIsbn() != null) {
            book.setIsbn(bookParams.getIsbn());
        }
        if (bookParams.getTitle() != null) {
            book.setTitle(bookParams.getTitle());
        }
        if (bookParams.getAuthor() != null) {
            book.setAuthor(bookParams.getAuthor());
        }
        if (bookParams.getPublisher() != null) {
            book.setPublisher(bookParams.getPublisher());
        }
        if (bookParams.getType() != null) {
            book.setType(bookParams.getType());
        }
        return book;
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable long id) {
        memoryBookService.getList().removeIf(x-> x.getId() == id);
    }
    */
}

//GET
// /books/
// Zwraca listę wszystkich książek.
//POST
// /books/
// Tworzy nową książkę na podstawie danych przekazanych z formularza i zapisuje ją do bazy danych.
//GET
// /books/{id}
// Wyświetla informacje o książce o podanym id.
//PUT
// /books/{id}
// Zmienia informacje o książce o podanym id na nową.
//DELETE
// /books/{id}
// Usuwa książkę o podanym id z bazy danych.