package de.ait.hw_12.controllers;

public class Now {
    String dateTime;

    public Now() {}

    public Now(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Now{" +
                "dateTime='" + dateTime + '\'' +
                '}';
    }
}
