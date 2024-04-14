package com.cloud.films;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table(name = "sv_34_2021")
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
