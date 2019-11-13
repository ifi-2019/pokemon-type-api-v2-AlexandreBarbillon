package com.ifi.tp.pokemon_type_api.service;

import com.ifi.tp.pokemon_type_api.bo.PokemonType;
import com.ifi.tp.pokemon_type_api.repository.PokemonTypeRepository;

import java.util.List;

public class PokemonTypeServiceImpl implements PokemonTypeService {
    private PokemonTypeRepository pokeRepo;
    public PokemonTypeServiceImpl(PokemonTypeRepository pokemonTypeRepository) {
        this.pokeRepo = pokemonTypeRepository;
    }

    @Override
    public PokemonType getPokemonType(int id) {
        return this.pokeRepo.findPokemonTypeById(id);
    }

    @Override
    public List<PokemonType> getAllPokemonTypes() {
        return this.pokeRepo.findAllPokemonType();
    }

    public PokemonTypeRepository getPokeRepo() {
        return pokeRepo;
    }
}
