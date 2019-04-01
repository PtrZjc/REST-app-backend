package pl.zajacp.domain.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Long id;
    @Column(length = 10,
            nullable = false)
    private String isbn;
    @Column(length = 100,
            nullable = false)
    private String title;
    @Column(length = 100,
            nullable = false)
    private String author;
    @Column(length = 100,
            nullable = false)
    private String publisher;
    @Column(length = 100,
            nullable = false)
    private String type;
    @Column(name = "created_on")
    private LocalDateTime createdOn;

    public Book() {
    }

    public Book(long id, String isbn, String title, String author, String publisher, String type) {


        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
        this.createdOn = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "books{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @PrePersist
    public void prePersist() {
        createdOn = LocalDateTime.now();
    }
}
