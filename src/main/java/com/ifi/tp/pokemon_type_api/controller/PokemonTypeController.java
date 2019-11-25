package com.ifi.tp.pokemon_type_api.controller;

import com.ifi.tp.pokemon_type_api.bo.PokemonType;
import com.ifi.tp.pokemon_type_api.service.PokemonTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/pokemon-types")
public class PokemonTypeController {
    private PokemonTypeService pokeService;
    public PokemonTypeController(PokemonTypeService service) {
        this.pokeService = service;
    }

    @GetMapping("/{id}")
    public PokemonType getPokemonTypeFromId(@PathVariable int id) {
        return pokeService.getPokemonType(id);
    }
    @GetMapping(value = "/",params = "name")
    public PokemonType getPokemonTypeFromName(@RequestParam String name){
        return pokeService.getPokemonTypeByName(name);
    }
    @GetMapping(value = "/", params = "types")
    public List<PokemonType> getAllPokemonTypesByTypes(@RequestParam String types) {
        var typeList = Arrays.asList(types.split(","));
        return pokeService.getPokemonTypeByTypes(typeList);
    }
    @GetMapping(value = "/")
    public List<PokemonType> getAllPokemonTypes() {
        return pokeService.getAllPokemonTypes();
    }
}
