package dev.nahum.videogames_crud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Size;
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

    @NotBlank
    @Size(min = 3, max = 100, message = "The name should have between 3 and 100 characters" )
    private String name;

    @NotBlank
    @Size(min = 50, max = 200, message = "The description should have between 50 and 200 characters")
    private String description;

    @ManyToMany
    @JoinTable(
            name = "videogames_genres",
            joinColumns = @JoinColumn(name = "videogame_id"),
            inverseJoinColumns = @JoinColumn (name = "genre_id")
    )
    private List<Genre> genres;


}
