package de.ait.hw_12.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class BookRestController {
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getBook(){
        List<Book> booksList = new ArrayList<>();
        booksList.add(new Book("The Lord of the Rings"," J.R.R. Tolkien"));
        booksList.add(new Book("The Alchemist","Paulo Coelho"));

        return booksList;
    }
}
