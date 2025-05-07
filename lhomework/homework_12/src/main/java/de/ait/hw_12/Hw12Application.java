package de.ait.hw_12;
/*
Создать новый Spring-проект (не забудьте подклбчить SpringWeb) Ваш сервер должен:

"/info" - выдавать какую то приветственную html-страницу, с информацией
"/books" - выдавать JSON c информацией о нескольких книгах (список книг просто
 задайте в программе, как мы на занятие сделали список person)
"/films" - выдавать JSON c информацией о нескольких фильмах
"/now" - выдавать JSON с сегодняшней датой и временем
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw12Application {

    public static void main(String[] args) {
        SpringApplication.run(Hw12Application.class, args);
    }

}
