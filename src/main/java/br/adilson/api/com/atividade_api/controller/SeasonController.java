package br.adilson.api.com.atividade_api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.adilson.api.com.atividade_api.model.Season;
import br.adilson.api.com.atividade_api.service.SeasonService;

@RestController
@RequestMapping("/season")

public class SeasonController {

    @Autowired
    private SeasonService seasonService;

    @GetMapping
    public List<Season> findAll() {
        return seasonService.findAll();
    }

    @GetMapping("/{name}")
    public Season findOne(@PathVariable String name) {
        return seasonService.findOne(name);
    }

    @PostMapping
    public Map<String, String> insert(@RequestBody Season season) {
        return seasonService.insert(season);
    }

    @PutMapping
    public Map<String, String> edit(@RequestBody Season season) {
        return seasonService.edit(season);
    }

    @DeleteMapping("/{name}")
    public Map<String, String> remove(@PathVariable String name) {
        return seasonService.remove(name);
    }

}
