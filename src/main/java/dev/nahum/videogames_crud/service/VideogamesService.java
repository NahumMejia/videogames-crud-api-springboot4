package dev.nahum.videogames_crud.service;

import dev.nahum.videogames_crud.model.Videogame;
import dev.nahum.videogames_crud.repository.VideogameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideogamesService {

    private final VideogameRepository videogameRepository;


    public Videogame createVideogame(Videogame videogame) {
        return videogameRepository.save(videogame);
    }

    public Videogame editVideogame(Videogame videogame){
        return videogameRepository.save(videogame);
    }

    public void deleteVideogameById(Long id){
        videogameRepository.deleteById(id);
    }

    public List<Videogame> findAllVideogames(){
        return videogameRepository.findAll();
    }

    public Videogame findVideogameById(Long id){
        return videogameRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Videogame not found" + id) );
    }

}
