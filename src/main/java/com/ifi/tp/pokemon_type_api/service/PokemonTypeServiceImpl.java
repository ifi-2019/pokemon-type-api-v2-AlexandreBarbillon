package com.ifi.tp.pokemon_type_api.service;

import com.ifi.tp.pokemon_type_api.bo.PokemonType;
import com.ifi.tp.pokemon_type_api.repository.PokemonTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public PokemonType getPokemonTypeByName(String name) {
        return this.pokeRepo.findPokemonTypeByName(name);
    }

    @Override
    public List<PokemonType> getPokemonTypeByTypes(List<String> types) {
        return this.pokeRepo.findPokemonTypeByTypes(types);
    }

    @Override
    public List<PokemonType> getAllPokemonTypes() {
        return this.pokeRepo.findAllPokemonType();
    }

    public PokemonTypeRepository getPokeRepo() {
        return pokeRepo;
    }
}
