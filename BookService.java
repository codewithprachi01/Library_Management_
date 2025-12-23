package com.library.management.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.library.management.entity.Book;
import com.library.management.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public Book addBook(Book book) {
        return repo.save(book);
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book getBookById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }
}
