package de.ait.hw_12.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class FilmRestController {
    @RequestMapping(value = "/films", method = RequestMethod.GET)
    public List<Film> getFilm(){
        List<Film> filmsList = new ArrayList<>();
        filmsList.add(new Film("Detective"," https://www.youtube.com/watch?v=9241FSma6cE"));
        filmsList.add(new Film("Thriller","https://www.youtube.com/watch?v=v9NDLxESLqE"));

        return filmsList;
    }
}
