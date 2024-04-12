package com.cloud.films;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "film-lib")
public class FilmController {

    @Autowired
    private FilmService service;

    @GetMapping(value = "/films")
    public ResponseEntity<List<Film>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Film> add(@RequestParam("title") String title,
                                    @RequestParam("genre") String genre,
                                    @RequestParam("year") int year) {
        Film film = service.add(title, genre, year);
        return new ResponseEntity<>(film, HttpStatus.OK);
    }
}
