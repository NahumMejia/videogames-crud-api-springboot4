package dev.nahum.videogames_crud.controller;

import dev.nahum.videogames_crud.model.Videogame;
import dev.nahum.videogames_crud.service.VideogamesService;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/videogames")
public class VideogameController {

    private final VideogamesService videogamesService;

    @GetMapping("/{id}")
    public Videogame findVideogameById(@PathVariable Long id){
        return videogamesService.findVideogameById(id);
    }

    @PostMapping()
    public Videogame createVideogame(@RequestBody Videogame videogame){
        return videogamesService.createVideogame(videogame);
    }

    @PutMapping("/{id}")
    public Videogame editVideogame(@PathVariable Long id , @RequestBody Videogame videogame){
        videogame.setId(id);
        return videogamesService.editVideogame(videogame);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideogame(@PathVariable Long id){
        videogamesService.deleteVideogameById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public List<Videogame> findAllVideogames(){
        return  videogamesService.findAllVideogames();
    }
}
