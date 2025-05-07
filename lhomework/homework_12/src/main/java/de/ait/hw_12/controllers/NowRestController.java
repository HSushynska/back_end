package de.ait.hw_12.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@RestController

public class NowRestController {
    @RequestMapping(value = "/now", method = RequestMethod.GET)
    public Now getCurrentDateTime(){

        String currentDateTime = LocalDateTime.now().format(DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss"));
         return new Now(currentDateTime);
    }
}
