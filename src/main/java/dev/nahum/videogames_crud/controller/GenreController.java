package dev.nahum.videogames_crud.controller;


import dev.nahum.videogames_crud.model.Genre;
import dev.nahum.videogames_crud.service.GenreService;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/genres")
public class GenreController {

    private final GenreService genreService;

    @GetMapping()
    public List<Genre> findAll(){
        return genreService.getAllGenres();
    }

    @GetMapping("/{id}")
    public Genre findGenreById(@PathVariable Long id){
        return genreService.findGenreById(id);
    }

    @PostMapping()
    public Genre createGenre(@RequestBody Genre genre){
        return genreService.createGenre(genre);
    }

    @PutMapping("/{id}")
    public Genre editGenre(@PathVariable Long id, @RequestBody Genre genre){
        genre.setId(id);
        return genreService.editGenre(genre);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGenreById(@PathVariable Long id){
        genreService.deleteGenreById(id);
        return ResponseEntity.noContent().build();
    }
}
