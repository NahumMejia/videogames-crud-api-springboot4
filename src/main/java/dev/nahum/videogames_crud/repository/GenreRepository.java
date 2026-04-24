package dev.nahum.videogames_crud.repository;

import dev.nahum.videogames_crud.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
