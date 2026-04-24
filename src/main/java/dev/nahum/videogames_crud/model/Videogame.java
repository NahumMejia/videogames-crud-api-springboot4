package dev.nahum.videogames_crud.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Videogame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @ManyToMany
    @JoinTable(
            name = "videogames_genres",
            joinColumns = @JoinColumn(name = "videogame_id"),
            inverseJoinColumns = @JoinColumn (name = "genre_id")
    )
    private List<Genre> genres;


}
