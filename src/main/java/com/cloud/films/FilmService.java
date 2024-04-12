package com.cloud.films;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private FilmRepo repo;

    public List<Film> getAll() {
        return repo.findAll();
    }

    public Film add(String title, String genre, int year) {
        Film film = new Film(title, genre, year);
        return repo.save(film);
    }
}
