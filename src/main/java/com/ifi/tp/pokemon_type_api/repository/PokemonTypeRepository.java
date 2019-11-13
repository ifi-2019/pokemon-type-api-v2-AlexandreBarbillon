package com.ifi.tp.pokemon_type_api.repository;

import com.ifi.tp.pokemon_type_api.bo.PokemonType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonTypeRepository {
    PokemonType findPokemonTypeById(int id);
    PokemonType findPokemonTypeByName(String name);
    List<PokemonType> findAllPokemonType();
}