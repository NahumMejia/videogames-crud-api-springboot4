package dev.nahum.videogames_crud.repository;

import dev.nahum.videogames_crud.model.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideogameRepository extends JpaRepository<Videogame,Long> {
}
