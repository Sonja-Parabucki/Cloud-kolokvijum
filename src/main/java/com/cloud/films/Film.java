package com.cloud.films;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String title;
    public String genre;
    public long year;

    public Film() {}
    public Film(String title, String genre, int year) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }
}
