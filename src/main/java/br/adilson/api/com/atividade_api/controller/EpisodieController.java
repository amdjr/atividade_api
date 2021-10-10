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

import br.adilson.api.com.atividade_api.model.Episodie;
import br.adilson.api.com.atividade_api.service.EpisodieService;

@RestController
@RequestMapping("/eps")

public class EpisodieController {

    @Autowired
    private EpisodieService episodieService;

    @GetMapping
    public List<Episodie> findAll() {
        return episodieService.findAll();
    }

    @GetMapping("/{name}")
    public Episodie findOne(@PathVariable String name) {
        return episodieService.findOne(name);
    }

    @PostMapping
    public Map<String, String> insert(@RequestBody Episodie episodie) {
        return episodieService.insert(episodie);
    }

    @PutMapping
    public Map<String, String> edit(@RequestBody Episodie episodie) {
        return episodieService.edit(episodie);
    }

    @DeleteMapping("/{name}")
    public Map<String, String> remove(@PathVariable String name) {
        return episodieService.remove(name);
    }

}
