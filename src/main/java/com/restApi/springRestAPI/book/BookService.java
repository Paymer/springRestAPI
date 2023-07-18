package com.restApi.springRestAPI.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private ChapterService chapterService;

    private List<Book> bookList = getList();

    private List<Book> getList() {

        Book first = new Book("Pride and prejudice", "Jane Austen", "");
        Book second = new Book("Harry Potter", "J.K. Rowling", "");
        Book third = new Book("Foundation", "Isaac Asimov", "");

        return new ArrayList<>(List.of(first, second, third));
    }

    public Book getBookByTitle(String title) {
        Optional<Book> optionalBook = bookList.stream().filter(book -> book.getTitle().equals(title)).findAny();
        return optionalBook.isPresent()? optionalBook.get() : null;
    }

    public void addBook(Book newBook) {
        if (chapterService.dosmthng()){
            bookList.add(newBook);
        }
    }

    public List<Book> getBooks() {
        return bookList;
    }
}
