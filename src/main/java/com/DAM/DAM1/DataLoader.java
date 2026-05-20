package com.DAM.DAM1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.DAM.DAM1.Dominio.Pokemon;
import com.DAM.DAM1.Repositorio.PokemonRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public void run(String... args) throws Exception {
        if (pokemonRepository.count() == 0) {
            Pokemon p1 = new Pokemon();
            p1.setNombre("Pikachu");
            p1.setNivel(25);

            Pokemon p2 = new Pokemon();
            p2.setNombre("Charizard");
            p2.setNivel(50);

            pokemonRepository.saveAll(List.of(p1, p2));
            System.out.println("--> Datos de la Pokedex cargados con éxito.");
        }
    }
}