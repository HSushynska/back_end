package de.ait.hw_12.controllers;

public class Film {
String title;
String url;

    public Film() {}

    public Film(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
