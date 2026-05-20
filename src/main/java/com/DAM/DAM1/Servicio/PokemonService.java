package com.DAM.DAM1.Servicio;

import com.DAM.DAM1.Dominio.Pokemon;
import com.DAM.DAM1.Repositorio.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository repository;

    public List<Pokemon> obtenerTodos() {
        return repository.findAll();
    }

    public Optional<Pokemon> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Pokemon guardar(Pokemon pokemon) {
        return repository.save(pokemon);
    }

    public Pokemon actualizar(Long id, Pokemon pokemonActualizado) {
        return repository.findById(id).map(pokemon -> {
            pokemon.setNombre(pokemonActualizado.getNombre());
            pokemon.setNivel(pokemonActualizado.getNivel());
            return repository.save(pokemon);
        }).orElseThrow(() -> new RuntimeException("Pokémon no encontrado"));
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}