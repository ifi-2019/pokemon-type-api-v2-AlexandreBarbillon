package com.ifi.tp.pokemon_type_api.controller;

import com.ifi.tp.pokemon_type_api.bo.PokemonType;
import com.ifi.tp.pokemon_type_api.service.PokemonTypeService;

import java.util.List;

public class PokemonTypeController {
    private PokemonTypeService pokeService;
    public PokemonTypeController(PokemonTypeService service) {
        this.pokeService = service;
    }

    public PokemonType getPokemonTypeFromId(int i) {
        return pokeService.getPokemonType(i);
    }

    public List<PokemonType> getAllPokemonTypes() {
        return pokeService.getAllPokemonTypes();
    }
}
