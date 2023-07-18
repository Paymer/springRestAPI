package com.restApi.springRestAPI.book;

import com.restApi.springRestAPI.greeting.Greeting;
import com.restApi.springRestAPI.greeting.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;


public class BookServiceUnitTest {

    @InjectMocks
    private BookService service;

    @Mock
    private ChapterService chapterService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getBookByTitleTest(){
        Book actual = service.getBookByTitle("Foundation");

        assertEquals(new Book("Foundation", "Isaac Asimov", ""),actual);
    }

    @Test
    void addBookTest(){

        when(chapterService.dosmthng()).thenReturn(true);

       Book bookToAdd = new Book("Sherlock Holmes", "Arthur Conan Doyle", "");
       service.addBook(bookToAdd);

        assertEquals(bookToAdd,service.getBookByTitle("Sherlock Holmes"));
    }


}
