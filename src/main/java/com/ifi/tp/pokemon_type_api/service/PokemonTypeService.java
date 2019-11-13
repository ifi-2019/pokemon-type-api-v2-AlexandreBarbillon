package com.ifi.tp.pokemon_type_api.service;

import com.ifi.tp.pokemon_type_api.bo.PokemonType;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PokemonTypeService {
    PokemonType getPokemonType(int id);
    PokemonType getPokemonTypeByName(String name);
    List<PokemonType> getAllPokemonTypes();
}
