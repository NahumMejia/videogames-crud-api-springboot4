package dev.nahum.videogames_crud.service;

import dev.nahum.videogames_crud.model.Genre;
import dev.nahum.videogames_crud.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreService {
    private final GenreRepository genreRepository;

    public Genre createGenre(Genre genre){
        return genreRepository.save(genre);
    }

    public Genre editGenre(Genre genre){
        return genreRepository.save(genre);
    }

    public void deleteGenreById(Long id){
        genreRepository.deleteById(id);
    }

    public List<Genre> getAllGenres(){
        return genreRepository.findAll();
    }
}
