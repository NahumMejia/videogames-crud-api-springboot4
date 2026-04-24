package dev.nahum.videogames_crud.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Genre {
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private Long id;

    private String name;
}
