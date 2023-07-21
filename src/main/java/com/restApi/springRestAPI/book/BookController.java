package com.restApi.springRestAPI.book;

import com.restApi.springRestAPI.book.Book;
import com.restApi.springRestAPI.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired private BookService service;

    @GetMapping("/book/{title}")
    public Book getBook (@PathVariable(value = "title")String title){
        return service.getBookByTitle(title);
    }

    @GetMapping("/book/all")
    public List<Book> getAll (){
        return service.getBooks();
    }

    @PostMapping("/book")
    public void getBookByAuthor (@RequestBody Book newBook){
        service.addBook(newBook);
    }
}
